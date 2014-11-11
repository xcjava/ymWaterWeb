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
import com.ymsino.water.service.freesettle.waterDayCost.QueryParam;
import com.ymsino.water.service.freesettle.waterDayCost.WaterDayCostReturn;
import com.ymsino.water.service.freesettle.waterDayCost.WaterDayCostService;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;
import com.ymsino.water.view.web.common.Arith;

public class DownloadWaterDayCostList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private WaterDayCostService waterDayCostService;
	private ChargingUnitService chargingUnitService;
	private int recordCount;
    private List<WaterDayCostReturn> list = new ArrayList<WaterDayCostReturn>();
    private String chargingUnitId;
    private String userId;
    private String waterCustomerId;
    private String payStatus;//支付状态-1:未支付;1已支付
    private String checkPayStatus;//扣费检查状态-1:未检查;1已检查
    private String meterHardwareId;//无线智能水表ID
    private String concHardwareId;//集中器逻辑地址
    private String freezeYear;//冻结时间（年）
    private String freezeMonth;//冻结时间（月）
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
		if(!StringUtil.isEmpty(payStatus)){
			qpw.addQueryParam("payStatus", Short.valueOf(payStatus), QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(checkPayStatus)){
			qpw.addQueryParam("checkPayStatus", Short.valueOf(checkPayStatus), QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(freezeYear)){
			qpw.addQueryParam("freezeYear", freezeYear.trim(), QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(freezeMonth)){
			qpw.addQueryParam("freezeMonth", freezeMonth.trim(), QueryCondition.QC_EQ);
		}
		
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = waterDayCostService.getListpager(qpm, 0, Integer.MAX_VALUE);
		recordCount = waterDayCostService.getCount(qpm);
		
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			WaterDayCostReturn wdc = list.get(i);
			if(wdc == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(wdc.getChargingUnitId());
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("ID", wdc.getId() == null ? "" : wdc.getId().toString());
			map.put("客户编号", StringUtil.isEmpty(wdc.getUserId()) ? "" : wdc.getUserId());
			map.put("集中器编号", StringUtil.isEmpty(wdc.getConcHardwareId()) ? "" : wdc.getConcHardwareId());
			map.put("水表编号", StringUtil.isEmpty(wdc.getMeterHardwareId()) ? "" : wdc.getMeterHardwareId());
			String payStatus = "";
			if(wdc.getPayStatus() != null){
				if(Short.valueOf("1").equals(wdc.getPayStatus())){
					payStatus = "已支付";
				}else if(Short.valueOf("-1").equals(wdc.getPayStatus())){
					payStatus = "未支付";
				}
			}
			map.put("支付状态", payStatus);
			String checkPayStatus = "";
			if(wdc.getCheckPayStatus() != null){
				if(Short.valueOf("1").equals(wdc.getCheckPayStatus())){
					checkPayStatus = "已检查";
				}else if(Short.valueOf("-1").equals(wdc.getCheckPayStatus())){
					checkPayStatus = "未检查";
				}
			}
			map.put("扣费检查状态", checkPayStatus);
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("1日用水费", wdc.getCost1() == null ? "" : Arith.div(String.valueOf(wdc.getCost1()), "10000", 4));
			map.put("2日用水费", wdc.getCost2() == null ? "" : Arith.div(String.valueOf(wdc.getCost2()), "10000", 4));
			map.put("3日用水费", wdc.getCost3() == null ? "" : Arith.div(String.valueOf(wdc.getCost3()), "10000", 4));
			map.put("4日用水费", wdc.getCost4() == null ? "" : Arith.div(String.valueOf(wdc.getCost4()), "10000", 4));
			map.put("5日用水费", wdc.getCost5() == null ? "" : Arith.div(String.valueOf(wdc.getCost5()), "10000", 4));
			map.put("6日用水费", wdc.getCost6() == null ? "" : Arith.div(String.valueOf(wdc.getCost6()), "10000", 4));
			map.put("7日用水费", wdc.getCost7() == null ? "" : Arith.div(String.valueOf(wdc.getCost7()), "10000", 4));
			map.put("8日用水费", wdc.getCost8() == null ? "" : Arith.div(String.valueOf(wdc.getCost8()), "10000", 4));
			map.put("9日用水费", wdc.getCost9() == null ? "" : Arith.div(String.valueOf(wdc.getCost9()), "10000", 4));
			map.put("10日用水费", wdc.getCost10() == null ? "" : Arith.div(String.valueOf(wdc.getCost10()), "10000", 4));
			map.put("11日用水费", wdc.getCost11() == null ? "" : Arith.div(String.valueOf(wdc.getCost11()), "10000", 4));
			map.put("12日用水费", wdc.getCost12() == null ? "" : Arith.div(String.valueOf(wdc.getCost12()), "10000", 4));
			map.put("13日用水费", wdc.getCost13() == null ? "" : Arith.div(String.valueOf(wdc.getCost13()), "10000", 4));
			map.put("14日用水费", wdc.getCost14() == null ? "" : Arith.div(String.valueOf(wdc.getCost14()), "10000", 4));
			map.put("15日用水费", wdc.getCost15() == null ? "" : Arith.div(String.valueOf(wdc.getCost15()), "10000", 4));
			map.put("16日用水费", wdc.getCost16() == null ? "" : Arith.div(String.valueOf(wdc.getCost16()), "10000", 4));
			map.put("17日用水费", wdc.getCost17() == null ? "" : Arith.div(String.valueOf(wdc.getCost17()), "10000", 4));
			map.put("18日用水费", wdc.getCost18() == null ? "" : Arith.div(String.valueOf(wdc.getCost18()), "10000", 4));
			map.put("19日用水费", wdc.getCost19() == null ? "" : Arith.div(String.valueOf(wdc.getCost19()), "10000", 4));
			map.put("20日用水费", wdc.getCost20() == null ? "" : Arith.div(String.valueOf(wdc.getCost20()), "10000", 4));
			map.put("21日用水费", wdc.getCost21() == null ? "" : Arith.div(String.valueOf(wdc.getCost21()), "10000", 4));
			map.put("22日用水费", wdc.getCost22() == null ? "" : Arith.div(String.valueOf(wdc.getCost22()), "10000", 4));
			map.put("23日用水费", wdc.getCost23() == null ? "" : Arith.div(String.valueOf(wdc.getCost23()), "10000", 4));
			map.put("24日用水费", wdc.getCost24() == null ? "" : Arith.div(String.valueOf(wdc.getCost24()), "10000", 4));
			map.put("25日用水费", wdc.getCost25() == null ? "" : Arith.div(String.valueOf(wdc.getCost25()), "10000", 4));
			map.put("26日用水费", wdc.getCost26() == null ? "" : Arith.div(String.valueOf(wdc.getCost26()), "10000", 4));
			map.put("27日用水费", wdc.getCost27() == null ? "" : Arith.div(String.valueOf(wdc.getCost27()), "10000", 4));
			map.put("28日用水费", wdc.getCost28() == null ? "" : Arith.div(String.valueOf(wdc.getCost28()), "10000", 4));
			map.put("29日用水费", wdc.getCost29() == null ? "" : Arith.div(String.valueOf(wdc.getCost29()), "10000", 4));
			map.put("30日用水费", wdc.getCost30() == null ? "" : Arith.div(String.valueOf(wdc.getCost30()), "10000", 4));
			map.put("31日用水费", wdc.getCost31() == null ? "" : Arith.div(String.valueOf(wdc.getCost31()), "10000", 4));
			
			map.put("月合计费用", wdc.getTotalCost() == null ? "" : Arith.div(String.valueOf(wdc.getTotalCost()), "10000", 4));
			map.put("冻结时间(年)", StringUtil.isEmpty(wdc.getFreezeYear()) ? "" : wdc.getFreezeYear());
			map.put("冻结时间(月)", StringUtil.isEmpty(wdc.getFreezeMonth()) ? "" : wdc.getFreezeMonth());
			map.put("创建时间", wdc.getCreateTimestamp() == null ? "" : DateUtil.format(new Date(wdc.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
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
	public List<WaterDayCostReturn> getList() {
		return list;
	}
	public void setList(List<WaterDayCostReturn> list) {
		this.list = list;
	}
	public String getWaterCustomerId() {
		return waterCustomerId;
	}
	public void setWaterCustomerId(String waterCustomerId) {
		this.waterCustomerId = waterCustomerId;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getCheckPayStatus() {
		return checkPayStatus;
	}
	public void setCheckPayStatus(String checkPayStatus) {
		this.checkPayStatus = checkPayStatus;
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
	public String getFreezeMonth() {
		return freezeMonth;
	}
	public void setFreezeMonth(String freezeMonth) {
		this.freezeMonth = freezeMonth;
	}
	public void setWaterDayCostService(WaterDayCostService waterDayCostService) {
		this.waterDayCostService = waterDayCostService;
	}
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}

}
