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
import com.ymsino.water.service.data.waterMonthUsageAmount.QueryParam;
import com.ymsino.water.service.data.waterMonthUsageAmount.WaterMonthUsageAmountReturn;
import com.ymsino.water.service.data.waterMonthUsageAmount.WaterMonthUsageAmountService;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class DownloadWaterMonthUsageAmountList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private String unitId;//收费单位编号
	private String userId;//客户编号
	private String freezeYear;//年份
	private String concHardwareId;//集中器编号
	private String meterHardwareId;//水表编号
	private List<WaterMonthUsageAmountReturn> list =  new ArrayList<WaterMonthUsageAmountReturn>();
	private int recordCount;
	private WaterMonthUsageAmountService waterMonthUsageAmountService;
	private ChargingUnitService chargingUnitService;
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
		//根据当前管理员的收费单位查询
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
		if(!StringUtil.isEmpty(concHardwareId)){
			qpw.addQueryParam("concHardwareId", concHardwareId, QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = waterMonthUsageAmountService.getListpager(qpm,0, Integer.MAX_VALUE);
		recordCount = waterMonthUsageAmountService.getCount(qpm);
		
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			WaterMonthUsageAmountReturn wmua = list.get(i);
			if(wmua == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(wmua.getChargingUnitId());
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("客户编号", StringUtil.isEmpty(wmua.getUserId()) ? "" : wmua.getUserId());
			map.put("集中器编号", StringUtil.isEmpty(wmua.getConcHardwareId()) ? "" : wmua.getConcHardwareId());
			map.put("水表编号", StringUtil.isEmpty(wmua.getMeterHardwareId()) ? "" : wmua.getMeterHardwareId());
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("冻结时间(年)", StringUtil.isEmpty(wmua.getFreezeYear()) ? "" : wmua.getFreezeYear());
			map.put("1日用水量", wmua.getUsageAmount1() == null ? "" : wmua.getUsageAmount1().toString());
			map.put("2日用水量", wmua.getUsageAmount2() == null ? "" : wmua.getUsageAmount2().toString());
			map.put("3日用水量", wmua.getUsageAmount3() == null ? "" : wmua.getUsageAmount3().toString());
			map.put("4日用水量", wmua.getUsageAmount4() == null ? "" : wmua.getUsageAmount4().toString());
			map.put("5日用水量", wmua.getUsageAmount5() == null ? "" : wmua.getUsageAmount5().toString());
			map.put("6日用水量", wmua.getUsageAmount6() == null ? "" : wmua.getUsageAmount6().toString());
			map.put("7日用水量", wmua.getUsageAmount7() == null ? "" : wmua.getUsageAmount7().toString());
			map.put("8日用水量", wmua.getUsageAmount8() == null ? "" : wmua.getUsageAmount8().toString());
			map.put("9日用水量", wmua.getUsageAmount9() == null ? "" : wmua.getUsageAmount9().toString());
			map.put("10日用水量", wmua.getUsageAmount10() == null ? "" : wmua.getUsageAmount10().toString());
			map.put("11日用水量", wmua.getUsageAmount11() == null ? "" : wmua.getUsageAmount11().toString());
			map.put("12日用水量", wmua.getUsageAmount12() == null ? "" : wmua.getUsageAmount12().toString());
			map.put("创建时间", wmua.getCreateTimestamp() == null ? "" : DateUtil.format(new Date(wmua.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
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
	public String getFreezeYear() {
		return freezeYear;
	}
	public void setFreezeYear(String freezeYear) {
		this.freezeYear = freezeYear;
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
	public List<WaterMonthUsageAmountReturn> getList() {
		return list;
	}
	public void setList(List<WaterMonthUsageAmountReturn> list) {
		this.list = list;
	}
	public void setWaterMonthUsageAmountService(
			WaterMonthUsageAmountService waterMonthUsageAmountService) {
		this.waterMonthUsageAmountService = waterMonthUsageAmountService;
	}

}
