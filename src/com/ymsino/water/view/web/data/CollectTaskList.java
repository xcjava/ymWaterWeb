package com.ymsino.water.view.web.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.date.DateUtil;
import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.collectTask.CollectTaskReturn;
import com.ymsino.water.service.data.collectTask.CollectTaskService;
import com.ymsino.water.service.data.collectTask.QueryParam;
import com.ymsino.water.view.web.common.PageModel;

public class CollectTaskList extends ActionSupport {


	private static final long serialVersionUID = 6970850564906342550L;
	private CollectTaskService collectTaskService;
    private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int recordCount;
	private int pageSize;
	private String message = "";
    private List<CollectTaskReturn> list = new ArrayList<CollectTaskReturn>();
    private String chargingUnitId;
    private String startDate;
    private String endDate;
    private String type;//任务类型
    
	public String execute() throws Exception{
		
		if (pageSize == 0)	pageSize = 20;
		if (pageIndex == 0)	pageIndex = 1;
		int recordCount=0;
		pageModel.setPageSize(pageSize);
		pageModel.setPageIndex(pageIndex);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("chargingUnitId");
		
		QueryParamWriter qpw = new QueryParamWriter();
		if(!StringUtil.isEmpty(managerUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+managerUnitId+"|%", QueryCondition.QC_LIKE);
		}
		if(!StringUtil.isEmpty(chargingUnitId)){
			chargingUnitId = chargingUnitId.trim();
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(type)){
			type = type.trim();
			qpw.addQueryParam("type", type, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(startDate)){
			Date sdate = DateUtil.parseDate(startDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
			qpw.addQueryParam("startTimestamp", sdate, QueryCondition.QC_GE);
		}
		if(!StringUtil.isEmpty(endDate)){
			Date sdate = DateUtil.parseDate(endDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
			qpw.addQueryParam("endTimestamp", sdate, QueryCondition.QC_LE);
		}
		
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = collectTaskService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = collectTaskService.getCount(qpm);
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

	public List<CollectTaskReturn> getList() {
		return list;
	}

	public void setCollectTaskService(CollectTaskService collectTaskService) {
		this.collectTaskService = collectTaskService;
	}

	public String getChargingUnitId() {
		return chargingUnitId;
	}

	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
