package com.ymsino.water.view.web.searchAnalysis;

import java.util.ArrayList;
import java.util.List;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.freezeData.FreezeDataReturn;
import com.ymsino.water.service.data.freezeData.FreezeDataService;
import com.ymsino.water.service.data.freezeData.QueryParam;
import com.ymsino.water.view.web.common.PageModel;

public class FreezeDataList extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String unitId;//收费单位编号
	private String concHardwareId;//集中器编号
	private String meterHardwareId;//水表编号
	private String userId;//客户编号
	
	private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int pageSize;
	private String message = "";
	
	private FreezeDataService freezeDataService;
	private List<FreezeDataReturn> list = new ArrayList<FreezeDataReturn>();
	
	public String execute(){
		if (pageSize == 0)	pageSize = 20;
		if (pageIndex == 0)	pageIndex = 1;
		int recordCount=10;
		pageModel.setPageSize(pageSize);
		pageModel.setPageIndex(pageIndex);
		
		QueryParamWriter qpw = new QueryParamWriter();
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
		if(!StringUtil.isEmpty(concHardwareId)){
			qpw.addQueryParam("concHardwareId", concHardwareId, QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = freezeDataService.getListpager(qpm,pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = freezeDataService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		return SUCCESS;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PageModel getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
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

	public List<FreezeDataReturn> getList() {
		return list;
	}

	public void setFreezeDataService(
			FreezeDataService freezeDataService) {
		this.freezeDataService = freezeDataService;
	}
	
}
