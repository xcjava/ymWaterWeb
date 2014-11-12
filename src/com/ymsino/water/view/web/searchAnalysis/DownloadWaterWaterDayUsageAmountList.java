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
import com.ymsino.water.service.data.waterDayUsageAmount.QueryParam;
import com.ymsino.water.service.data.waterDayUsageAmount.WaterDayUsageAmountReturn;
import com.ymsino.water.service.data.waterDayUsageAmount.WaterDayUsageAmountService;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class DownloadWaterWaterDayUsageAmountList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private String unitId;//收费单位编号
	private String userId;//客户编号
	private String freezeYear;//年份
	private String freezeMonth;//月份
	private String concHardwareId;//集中器编号
	private String meterHardwareId;//水表编号
	private List<WaterDayUsageAmountReturn> list =  new ArrayList<WaterDayUsageAmountReturn>();
	private int recordCount;
	private WaterDayUsageAmountService waterDayUsageAmountService;
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
		list = waterDayUsageAmountService.getListpager(qpm,0, Integer.MAX_VALUE);
		recordCount = waterDayUsageAmountService.getCount(qpm);
		
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			WaterDayUsageAmountReturn wdua = list.get(i);
			if(wdua == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(wdua.getChargingUnitId());
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("客户编号", StringUtil.isEmpty(wdua.getUserId()) ? "" : wdua.getUserId());
			map.put("集中器编号", StringUtil.isEmpty(wdua.getConcHardwareId()) ? "" : wdua.getConcHardwareId());
			map.put("水表编号", StringUtil.isEmpty(wdua.getMeterHardwareId()) ? "" : wdua.getMeterHardwareId());
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("冻结时间(年)", StringUtil.isEmpty(wdua.getFreezeYear()) ? "" : wdua.getFreezeYear());
			map.put("冻结时间(月)", StringUtil.isEmpty(wdua.getFreezeMonth()) ? "" : wdua.getFreezeMonth());
			map.put("1日用水量", wdua.getUsageAmount1() == null ? "" : wdua.getUsageAmount1().toString());
			map.put("2日用水量", wdua.getUsageAmount2() == null ? "" : wdua.getUsageAmount2().toString());
			map.put("3日用水量", wdua.getUsageAmount3() == null ? "" : wdua.getUsageAmount3().toString());
			map.put("4日用水量", wdua.getUsageAmount4() == null ? "" : wdua.getUsageAmount4().toString());
			map.put("5日用水量", wdua.getUsageAmount5() == null ? "" : wdua.getUsageAmount5().toString());
			map.put("6日用水量", wdua.getUsageAmount6() == null ? "" : wdua.getUsageAmount6().toString());
			map.put("7日用水量", wdua.getUsageAmount7() == null ? "" : wdua.getUsageAmount7().toString());
			map.put("8日用水量", wdua.getUsageAmount8() == null ? "" : wdua.getUsageAmount8().toString());
			map.put("9日用水量", wdua.getUsageAmount9() == null ? "" : wdua.getUsageAmount9().toString());
			map.put("10日用水量", wdua.getUsageAmount10() == null ? "" : wdua.getUsageAmount10().toString());
			map.put("11日用水量", wdua.getUsageAmount11() == null ? "" : wdua.getUsageAmount11().toString());
			map.put("12日用水量", wdua.getUsageAmount12() == null ? "" : wdua.getUsageAmount12().toString());
			map.put("13日用水量", wdua.getUsageAmount13() == null ? "" : wdua.getUsageAmount13().toString());
			map.put("14日用水量", wdua.getUsageAmount14() == null ? "" : wdua.getUsageAmount14().toString());
			map.put("15日用水量", wdua.getUsageAmount15() == null ? "" : wdua.getUsageAmount15().toString());
			map.put("16日用水量", wdua.getUsageAmount16() == null ? "" : wdua.getUsageAmount16().toString());
			map.put("17日用水量", wdua.getUsageAmount17() == null ? "" : wdua.getUsageAmount17().toString());
			map.put("18日用水量", wdua.getUsageAmount18() == null ? "" : wdua.getUsageAmount18().toString());
			map.put("19日用水量", wdua.getUsageAmount19() == null ? "" : wdua.getUsageAmount19().toString());
			map.put("20日用水量", wdua.getUsageAmount20() == null ? "" : wdua.getUsageAmount20().toString());
			map.put("21日用水量", wdua.getUsageAmount21() == null ? "" : wdua.getUsageAmount21().toString());
			map.put("22日用水量", wdua.getUsageAmount22() == null ? "" : wdua.getUsageAmount22().toString());
			map.put("23日用水量", wdua.getUsageAmount23() == null ? "" : wdua.getUsageAmount23().toString());
			map.put("24日用水量", wdua.getUsageAmount24() == null ? "" : wdua.getUsageAmount24().toString());
			map.put("25日用水量", wdua.getUsageAmount25() == null ? "" : wdua.getUsageAmount25().toString());
			map.put("26日用水量", wdua.getUsageAmount26() == null ? "" : wdua.getUsageAmount26().toString());
			map.put("27日用水量", wdua.getUsageAmount27() == null ? "" : wdua.getUsageAmount27().toString());
			map.put("28日用水量", wdua.getUsageAmount28() == null ? "" : wdua.getUsageAmount28().toString());
			map.put("29日用水量", wdua.getUsageAmount29() == null ? "" : wdua.getUsageAmount29().toString());
			map.put("30日用水量", wdua.getUsageAmount30() == null ? "" : wdua.getUsageAmount30().toString());
			map.put("31日用水量", wdua.getUsageAmount31() == null ? "" : wdua.getUsageAmount31().toString());
			map.put("创建时间", wdua.getCreateTimestamp() == null ? "" : DateUtil.format(new Date(wdua.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
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
	public String getFreezeMonth() {
		return freezeMonth;
	}
	public void setFreezeMonth(String freezeMonth) {
		this.freezeMonth = freezeMonth;
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
	public List<WaterDayUsageAmountReturn> getList() {
		return list;
	}
	public void setList(List<WaterDayUsageAmountReturn> list) {
		this.list = list;
	}
	public void setWaterDayUsageAmountService(
			WaterDayUsageAmountService waterDayUsageAmountService) {
		this.waterDayUsageAmountService = waterDayUsageAmountService;
	}
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}

}
