package com.ymsino.water.view.web.freesettle;

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
import com.ymsino.water.service.freesettle.waterMonthCost.QueryParam;
import com.ymsino.water.service.freesettle.waterMonthCost.WaterMonthCostReturn;
import com.ymsino.water.service.freesettle.waterMonthCost.WaterMonthCostService;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;
import com.ymsino.water.view.web.common.Arith;

public class DownloadWaterMonthCostList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private WaterMonthCostService waterMonthCostService;
	private ChargingUnitService chargingUnitService;
	private int recordCount;
    private List<WaterMonthCostReturn> list = new ArrayList<WaterMonthCostReturn>();
    private String chargingUnitId;
    private String userId;
    private String waterCustomerId;
    private String meterHardwareId;//无线智能水表ID
    private String concHardwareId;//集中器逻辑地址
    private String freezeYear;//冻结时间（年）
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
		if(!StringUtil.isEmpty(chargingUnitId)){
			chargingUnitId = chargingUnitId.trim();
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(userId)){
			userId = userId.trim();
			qpw.addQueryParam("userId", userId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(waterCustomerId)){
			waterCustomerId = waterCustomerId.trim();
			qpw.addQueryParam("waterCustomerId", waterCustomerId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(meterHardwareId)){
			meterHardwareId = meterHardwareId.trim();
			qpw.addQueryParam("meterHardwareId", meterHardwareId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(concHardwareId)){
			concHardwareId = concHardwareId.trim();
			qpw.addQueryParam("concHardwareId", concHardwareId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(freezeYear)){
			freezeYear = freezeYear.trim();
			qpw.addQueryParam("freezeYear", freezeYear, QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = waterMonthCostService.getListpager(qpm, 0, Integer.MAX_VALUE);
		recordCount = waterMonthCostService.getCount(qpm);
		
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			WaterMonthCostReturn wmc = list.get(i);
			if(wmc == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(wmc.getChargingUnitId());
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("ID", wmc.getId() == null ? "" : wmc.getId().toString());
			map.put("客户编号", StringUtil.isEmpty(wmc.getUserId()) ? "" : wmc.getUserId());
			map.put("集中器编号", StringUtil.isEmpty(wmc.getConcHardwareId()) ? "" : wmc.getConcHardwareId());
			map.put("水表编号", StringUtil.isEmpty(wmc.getMeterHardwareId()) ? "" : wmc.getMeterHardwareId());
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("1月用水费", wmc.getCost1() == null ? "" : Arith.div(String.valueOf(wmc.getCost1()), "10000", 4));
			map.put("2月用水费", wmc.getCost2() == null ? "" : Arith.div(String.valueOf(wmc.getCost2()), "10000", 4));
			map.put("3月用水费", wmc.getCost3() == null ? "" : Arith.div(String.valueOf(wmc.getCost3()), "10000", 4));
			map.put("4月用水费", wmc.getCost4() == null ? "" : Arith.div(String.valueOf(wmc.getCost4()), "10000", 4));
			map.put("5月用水费", wmc.getCost5() == null ? "" : Arith.div(String.valueOf(wmc.getCost5()), "10000", 4));
			map.put("6月用水费", wmc.getCost6() == null ? "" : Arith.div(String.valueOf(wmc.getCost6()), "10000", 4));
			map.put("7月用水费", wmc.getCost7() == null ? "" : Arith.div(String.valueOf(wmc.getCost7()), "10000", 4));
			map.put("8月用水费", wmc.getCost8() == null ? "" : Arith.div(String.valueOf(wmc.getCost8()), "10000", 4));
			map.put("9月用水费", wmc.getCost9() == null ? "" : Arith.div(String.valueOf(wmc.getCost9()), "10000", 4));
			map.put("10月用水费", wmc.getCost10() == null ? "" : Arith.div(String.valueOf(wmc.getCost10()), "10000", 4));
			map.put("11月用水费", wmc.getCost11() == null ? "" : Arith.div(String.valueOf(wmc.getCost11()), "10000", 4));
			map.put("12月用水费", wmc.getCost12() == null ? "" : Arith.div(String.valueOf(wmc.getCost12()), "10000", 4));
			map.put("冻结时间(年)", StringUtil.isEmpty(wmc.getFreezeYear()) ? "" : wmc.getFreezeYear());
			map.put("创建时间", wmc.getCreateTimestamp() == null ? "" : DateUtil.format(new Date(wmc.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
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
	public String getWaterCustomerId() {
		return waterCustomerId;
	}
	public void setWaterCustomerId(String waterCustomerId) {
		this.waterCustomerId = waterCustomerId;
	}
	public String getMeterHardwareId() {
		return meterHardwareId;
	}
	public void setMeterHardwareId(String meterHardwareId) {
		this.meterHardwareId = meterHardwareId;
	}
	public String getConcHardwareId() {
		return concHardwareId;
	}
	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}
	public String getFreezeYear() {
		return freezeYear;
	}
	public void setFreezeYear(String freezeYear) {
		this.freezeYear = freezeYear;
	}
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}
	public List<WaterMonthCostReturn> getList() {
		return list;
	}
	public void setList(List<WaterMonthCostReturn> list) {
		this.list = list;
	}
	public void setWaterMonthCostService(WaterMonthCostService waterMonthCostService) {
		this.waterMonthCostService = waterMonthCostService;
	}

}
