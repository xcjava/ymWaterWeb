package com.ymsino.water.view.web.searchAnalysis;

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
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.gmail.xcjava.base.io.FilesTool;
import com.gmail.xcjava.base.io.PropertyReader;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataReturn;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataService;
import com.ymsino.water.service.data.checkingFreezeData.QueryParam;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;
import com.ymsino.water.view.web.common.PageModel;

public class DownloadCheckingFreezeDataList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private String unitId;//收费单位编号
	private String userId;//客户编号
	private String freezeYear;//年份
	private String freezeMonth;//月份
	private String concHardwareId;//集中器编号
	private String meterHardwareId;//水表编号
	private List<CheckingFreezeDataReturn> list =  new ArrayList<CheckingFreezeDataReturn>();
	private CheckingFreezeDataService checkingFreezeDataService;
	private int recordCount;
	private ChargingUnitService chargingUnitService;
	@Override
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("sessionUnitId");
		
		String exportCount = PropertyReader.getProperties("config.properties").getProperty("exportCount");
		
		QueryParamWriter qpw = new QueryParamWriter();
		
		//根据当前管理员的收费单位查询
		if(!StringUtil.isEmpty(managerUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+managerUnitId+"|%", QueryCondition.QC_LIKE);
		}
		
		if(!StringUtil.isEmpty(unitId)){
			qpw.addQueryParam("chargingUnitId", unitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(userId)){
			qpw.addQueryParam("userId", userId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(meterHardwareId)){
			qpw.addQueryParam("meterHardwareId", meterHardwareId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(freezeYear)){
			qpw.addQueryParam("freezeYear", freezeYear, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(freezeMonth)){
			qpw.addQueryParam("freezeMonth", freezeMonth, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(concHardwareId)){
			qpw.addQueryParam("concHardwareId", concHardwareId, QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = checkingFreezeDataService.getListpager(qpm,0, Integer.MAX_VALUE);
		recordCount = checkingFreezeDataService.getCount(qpm);
		
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			CheckingFreezeDataReturn cfd = list.get(i);
			if(cfd == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(cfd.getChargingUnitId());
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("客户编号", StringUtil.isEmpty(cfd.getUserId()) ? "" : cfd.getUserId());
			map.put("集中器编号", StringUtil.isEmpty(cfd.getConcHardwareId()) ? "" : cfd.getConcHardwareId());
			map.put("表计编号", StringUtil.isEmpty(cfd.getMeterHardwareId()) ? "" : cfd.getMeterHardwareId());
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("冻结时间", StringUtil.isEmpty(cfd.getFreezeYear()+""+cfd.getFreezeMonth()) ? "" : cfd.getFreezeYear()+"年"+cfd.getFreezeMonth()+"月");
			map.put("1日用水量", cfd.getMeterReading1() == null ? "" : cfd.getMeterReading1().toString());
			map.put("2日用水量", cfd.getMeterReading2() == null ? "" : cfd.getMeterReading2().toString());
			map.put("3日用水量", cfd.getMeterReading3() == null ? "" : cfd.getMeterReading3().toString());
			map.put("4日用水量", cfd.getMeterReading4() == null ? "" : cfd.getMeterReading4().toString());
			map.put("5日用水量", cfd.getMeterReading5() == null ? "" : cfd.getMeterReading5().toString());
			map.put("6日用水量", cfd.getMeterReading6() == null ? "" : cfd.getMeterReading6().toString());
			map.put("7日用水量", cfd.getMeterReading7() == null ? "" : cfd.getMeterReading7().toString());
			map.put("8日用水量", cfd.getMeterReading8() == null ? "" : cfd.getMeterReading8().toString());
			map.put("9日用水量", cfd.getMeterReading9() == null ? "" : cfd.getMeterReading9().toString());
			map.put("10日用水量", cfd.getMeterReading10() == null ? "" : cfd.getMeterReading10().toString());
			map.put("11日用水量", cfd.getMeterReading11() == null ? "" : cfd.getMeterReading11().toString());
			map.put("12日用水量", cfd.getMeterReading12() == null ? "" : cfd.getMeterReading12().toString());
			map.put("13日用水量", cfd.getMeterReading13() == null ? "" : cfd.getMeterReading13().toString());
			map.put("14日用水量", cfd.getMeterReading14() == null ? "" : cfd.getMeterReading14().toString());
			map.put("15日用水量", cfd.getMeterReading15() == null ? "" : cfd.getMeterReading15().toString());
			map.put("16日用水量", cfd.getMeterReading16() == null ? "" : cfd.getMeterReading16().toString());
			map.put("17日用水量", cfd.getMeterReading17() == null ? "" : cfd.getMeterReading17().toString());
			map.put("18日用水量", cfd.getMeterReading18() == null ? "" : cfd.getMeterReading18().toString());
			map.put("19日用水量", cfd.getMeterReading19() == null ? "" : cfd.getMeterReading19().toString());
			map.put("20日用水量", cfd.getMeterReading20() == null ? "" : cfd.getMeterReading20().toString());
			map.put("21日用水量", cfd.getMeterReading21() == null ? "" : cfd.getMeterReading21().toString());
			map.put("22日用水量", cfd.getMeterReading22() == null ? "" : cfd.getMeterReading22().toString());
			map.put("23日用水量", cfd.getMeterReading23() == null ? "" : cfd.getMeterReading23().toString());
			map.put("24日用水量", cfd.getMeterReading24() == null ? "" : cfd.getMeterReading24().toString());
			map.put("25日用水量", cfd.getMeterReading25() == null ? "" : cfd.getMeterReading25().toString());
			map.put("26日用水量", cfd.getMeterReading26() == null ? "" : cfd.getMeterReading26().toString());
			map.put("27日用水量", cfd.getMeterReading27() == null ? "" : cfd.getMeterReading27().toString());
			map.put("28日用水量", cfd.getMeterReading28() == null ? "" : cfd.getMeterReading28().toString());
			map.put("29日用水量", cfd.getMeterReading29() == null ? "" : cfd.getMeterReading29().toString());
			map.put("30日用水量", cfd.getMeterReading30() == null ? "" : cfd.getMeterReading30().toString());
			map.put("31日用水量", cfd.getMeterReading31() == null ? "" : cfd.getMeterReading31().toString());
			map.put("创建时间", cfd.getCreateTimestamp() == null ? "" : DateUtil.format(new Date(cfd.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
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
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getConcHardwareId() {
		return concHardwareId;
	}
	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}
	public String getMeterHardwareId() {
		return meterHardwareId;
	}
	public void setMeterHardwareId(String meterHardwareId) {
		this.meterHardwareId = meterHardwareId;
	}
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}
	public String getFreezeYear() {
		return freezeYear;
	}
	public void setFreezeYear(String freezeYear) {
		this.freezeYear = freezeYear;
	}
	public String getFreezeMonth() {
		return freezeMonth;
	}
	public void setFreezeMonth(String freezeMonth) {
		this.freezeMonth = freezeMonth;
	}
	public List<CheckingFreezeDataReturn> getList() {
		return list;
	}
	public void setList(List<CheckingFreezeDataReturn> list) {
		this.list = list;
	}
	public void setCheckingFreezeDataService(
			CheckingFreezeDataService checkingFreezeDataService) {
		this.checkingFreezeDataService = checkingFreezeDataService;
	}

}
