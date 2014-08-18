package com.ymsino.water.view.web.freesettle;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.freesettle.waterDayCost.QueryParam;
import com.ymsino.water.service.freesettle.waterDayCost.WaterDayCostReturn;
import com.ymsino.water.service.freesettle.waterDayCost.WaterDayCostService;
import com.ymsino.water.view.web.common.PageModel;

public class WaterDayCostList extends ActionSupport {


	private static final long serialVersionUID = 6970850564906342550L;
	private WaterDayCostService waterDayCostService;
    private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int recordCount;
	private int pageSize;
	private String message = "";
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
    
	public String execute() throws Exception{
		
		if (pageSize == 0)	pageSize = 20;
		if (pageIndex == 0)	pageIndex = 1;
		int recordCount=0;
		pageModel.setPageSize(pageSize);
		pageModel.setPageIndex(pageIndex);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("sessionUnitId");
		
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
		list = waterDayCostService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = waterDayCostService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		
		return SUCCESS;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}


	public int getRecordCount() {
		return recordCount;
	}


	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public PageModel getPageModel() {
		return pageModel;
	}


	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

	public String getChargingUnitId() {
		return chargingUnitId;
	}

	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}

	public List<WaterDayCostReturn> getList() {
		return list;
	}

	public void setWaterDayCostService(WaterDayCostService waterDayCostService) {
		this.waterDayCostService = waterDayCostService;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

}
