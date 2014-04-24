package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.service.manager.manager.ManagerService;
import com.ymsino.water.service.manager.manager.QueryParam;
import com.ymsino.water.view.web.common.PageModel;

public class ManagerList extends ActionSupport {


	private static final long serialVersionUID = 6970850564906342550L;
	private ManagerService managerService;
    private Short status = null;
    private String managerId = null;
    private String chargingUnitId = null;
    private String departmentId = null;
    private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int recordCount;
	private int pageSize;
	private String message = "";
    private List<ManagerReturn> list = new ArrayList<ManagerReturn>();
	public String execute() throws Exception, UnsupportedEncodingException{
		
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
		if(!StringUtil.isEmpty(managerId)){
			qpw.addQueryParam("managerId", managerId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(chargingUnitId)){
			chargingUnitId = chargingUnitId.trim();
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(departmentId)){
			departmentId = departmentId.trim();
			qpw.addQueryParam("departmentId", departmentId, QueryCondition.QC_EQ);
		}
		if(status != null){
			qpw.addQueryParam("status", status, QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = managerService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = managerService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		
		return SUCCESS;
	}
	

	public Short getStatus() {
		return status;
	}


	public void setStatus(Short status) {
		this.status = status;
	}

	public String getManagerId() {
		return managerId;
	}


	public void setManagerId(String managerId) {
		this.managerId = managerId;
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
	

	public List<ManagerReturn> getList() {
		return list;
	}


	public void setList(List<ManagerReturn> list) {
		this.list = list;
	}


	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getChargingUnitId() {
		return chargingUnitId;
	}


	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}


	public String getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}


	public PageModel getPageModel() {
		return pageModel;
	}


	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}
	
}
