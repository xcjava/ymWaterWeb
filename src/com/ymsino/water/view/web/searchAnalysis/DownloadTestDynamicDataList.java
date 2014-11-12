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
import com.ymsino.water.service.data.testDynamicData.QueryParam;
import com.ymsino.water.service.data.testDynamicData.TestDynamicDataReturn;
import com.ymsino.water.service.data.testDynamicData.TestDynamicDataService;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class DownloadTestDynamicDataList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private String unitId;//收费单位编号
	private String concHardwareId;//集中器编号
	private String meterHardwareId;//水表编号
	private String userId;//客户编号
	private TestDynamicDataService testDynamicDataService;
	private List<TestDynamicDataReturn> list = new ArrayList<TestDynamicDataReturn>();
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
		if(!StringUtil.isEmpty(concHardwareId)){
			qpw.addQueryParam("concHardwareId", concHardwareId, QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = testDynamicDataService.getListpager(qpm,0, Integer.MAX_VALUE);
		recordCount = testDynamicDataService.getCount(qpm);
		
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			TestDynamicDataReturn tdd = list.get(i);
			if(tdd == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(tdd.getChargingUnitId());
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("客户编号", StringUtil.isEmpty(tdd.getUserId()) ? "" : tdd.getUserId());
			map.put("集中器编号", StringUtil.isEmpty(tdd.getConcHardwareId()) ? "" : tdd.getConcHardwareId());
			map.put("表计编号", StringUtil.isEmpty(tdd.getMeterHardwareId()) ? "" : tdd.getMeterHardwareId());
			
			map.put("本机表码", tdd.getMeterReading() == null ? "" : tdd.getMeterReading().toString());
			map.put("电池电压", tdd.getBatteryVoltage() == null ? "" : tdd.getBatteryVoltage().toString());
			String dataType = "";
			if(!StringUtil.isEmpty(tdd.getDataType())){
				if("0".equals(tdd.getDataType()))
					dataType = "光电";
				else if("1".equals(tdd.getDataType()))
					dataType = "脉冲";
			}
			map.put("模块类型", dataType);
			String magneticAttack = "";
			if(!StringUtil.isEmpty(tdd.getMagneticAttack())){
				if("0".equals(tdd.getMagneticAttack()))
					magneticAttack = "无磁攻击";
				else if("1".equals(tdd.getMagneticAttack()))
					magneticAttack = "有磁攻击";
			}
			map.put("磁攻击", magneticAttack);
			String errorStatus = "";
			if(!StringUtil.isEmpty(tdd.getErrorStatus())){
				if("0".equals(tdd.getErrorStatus()))
					errorStatus = "正确";
				else if("1".equals(tdd.getErrorStatus()))
					errorStatus = "错误";
			}
			map.put("数据异常", errorStatus);
			String replyStatus = "";
			if(!StringUtil.isEmpty(tdd.getReplyStatus())){
				if("0".equals(tdd.getReplyStatus()))
					replyStatus = "有应答";
				else if("1".equals(tdd.getReplyStatus()))
					replyStatus = "无应答";
			}
			map.put("数据答应", replyStatus);
			
			String valveStatus = "";
			if(!StringUtil.isEmpty(tdd.getValveStatus())){
				if("01".equals(tdd.getValveStatus())){
					valveStatus = "半阀";
				}else if("10".equals(tdd.getValveStatus())){
					valveStatus = "开阀";
				}else if("11".equals(tdd.getValveStatus())){
					valveStatus = "关阀";
				}else if("00".equals(tdd.getValveStatus())){
					valveStatus = "未知";
				}
			}
			map.put("阀门状态", valveStatus);
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("真实抄表时间", tdd.getRealTimestamp() == null ? "" : DateUtil.format(new Date(tdd.getRealTimestamp()), "yyyy-MM-dd HH:mm:ss"));
			map.put("创建时间", tdd.getCreateTimestamp() == null ? "" : DateUtil.format(new Date(tdd.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
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
	public List<TestDynamicDataReturn> getList() {
		return list;
	}
	public void setList(List<TestDynamicDataReturn> list) {
		this.list = list;
	}
	public void setTestDynamicDataService(
			TestDynamicDataService testDynamicDataService) {
		this.testDynamicDataService = testDynamicDataService;
	}

}
