package com.ymsino.water.view.web.archives;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.date.DateUtil;
import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryLink;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.gmail.xcjava.base.io.FilesTool;
import com.gmail.xcjava.base.io.PropertyReader;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterMeter.QueryParam;
import com.ymsino.water.service.archives.waterMeter.WaterMeterReturn;
import com.ymsino.water.service.archives.waterMeter.WaterMeterService;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class DownloadWaterMeterList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private WaterMeterService waterMeterService;
	private ChargingUnitService chargingUnitService;
	private int recordCount;
    private List<WaterMeterReturn> list = new ArrayList<WaterMeterReturn>();
    private Short type = 3;//水表类型，1：IC卡，2：红外卡，3：无线智能
    private String chargingUnitId;
    private String userId;//客户编号
    private String userName;//客户名称
    private String startDate;//创建时间范围开始
	private String endDate;//创建时间范围结束
	private String hardwareId;//水表编号
	private String dataType;//数据类别，1脉冲、2直读
	@Override
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("sessionUnitId");
		
		String exportCount = PropertyReader.getProperties("config.properties").getProperty("exportCount");
		
		QueryParamWriter qpw = new QueryParamWriter();
		if(!StringUtil.isEmpty(managerUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+managerUnitId+"|%", QueryCondition.QC_LIKE);
		}
		if(type != null){
			qpw.addQueryParam("type", Short.valueOf(type), QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(chargingUnitId)){
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(userId)){
			qpw.addQueryParam("userId", userId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(userName)){
			qpw.addQueryParam("userName", userName, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(hardwareId)){
			qpw.addQueryParam("hardwareId", hardwareId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(dataType)){
			qpw.addQueryParam("dataType", dataType, QueryCondition.QC_EQ);
		}
		
		if(!StringUtil.isEmpty(startDate) && !StringUtil.isEmpty(endDate)){
			if(DateUtil.parseDate(startDate, "yyyy-MM-dd").getTime() > DateUtil.parseDate(endDate , "yyyy-MM-dd").getTime()){
				Date date1 = DateUtil.parseDate(startDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
				Date date2 = DateUtil.parseDate(endDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
				qpw.addQueryParams(new String[]{"createTimestamp","createTimestamp"},  new Object[]{date2.getTime(),date1.getTime()} , new QueryCondition[]{QueryCondition.QC_GE,QueryCondition.QC_LE},new QueryLink[]{QueryLink.QL_AND});
			}else{
				Date date1 = DateUtil.parseDate(startDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
				Date date2 = DateUtil.parseDate(endDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
				qpw.addQueryParams(new String[]{"createTimestamp","createTimestamp"},  new Object[]{date1.getTime(),date2.getTime()} , new QueryCondition[]{QueryCondition.QC_GE,QueryCondition.QC_LE},new QueryLink[]{QueryLink.QL_AND});
			}
		}
		
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = waterMeterService.getListpager(qpm, 0, Integer.MAX_VALUE);
		recordCount = waterMeterService.getCount(qpm);		
		
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			WaterMeterReturn wm = list.get(i);
			if(wm == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(wm.getChargingUnitId());
			
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("水表编号", StringUtil.isEmpty(wm.getHardwareId()) ? "" : wm.getHardwareId());
			map.put("用水性质", StringUtil.isEmpty(wm.getNature()) ? "" : wm.getNature());
			map.put("客户编号", StringUtil.isEmpty(wm.getUserId()) ? "" : wm.getUserId());
			map.put("客户姓名", StringUtil.isEmpty(wm.getUserName()) ? "" : wm.getUserName());
			map.put("创建时间", wm.getCreateTimestamp() == null ? "" : DateUtil.format(new Date(wm.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			linkedHashMap.put(String.valueOf(i), map);
		}
		try {
			response.addHeader("Content-Disposition", "attachment;filename=\"" + "report.xls" + "\"");
			FilesTool.writeToExcel(linkedHashMap, null, response);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getChargingUnitId() {
		return chargingUnitId;
	}
	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<WaterMeterReturn> getList() {
		return list;
	}
	public void setList(List<WaterMeterReturn> list) {
		this.list = list;
	}
	public Short getType() {
		return type;
	}
	public void setType(Short type) {
		this.type = type;
	}
	public String getHardwareId() {
		return hardwareId;
	}
	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public void setWaterMeterService(WaterMeterService waterMeterService) {
		this.waterMeterService = waterMeterService;
	}

}
