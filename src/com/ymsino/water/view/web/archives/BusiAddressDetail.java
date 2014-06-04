package com.ymsino.water.view.web.archives;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.gmail.xcjava.base.web.PageModel;
import com.google.gson.Gson;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.busiAddress.QueryParam;
import com.ymsino.water.service.archives.busiAddress.BusiAddressReturn;
import com.ymsino.water.service.archives.busiAddress.BusiAddressService;

public class BusiAddressDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private BusiAddressService busiAddressService;
	private List<BusiAddressReturn> busiAddressList;
	private PageModel pageModel=new PageModel();
	private int pageIndex;
	private int pageSize;
	private String id;//这是客户id
	private String message;
	private String curr;
	private String busiAddressListJson;
	
	@Override
	public String execute() throws Exception {
		if (pageIndex == 0) {pageIndex = 1;}
		if (pageSize == 0) {pageSize = 20;}
		pageModel.setPageIndex(pageIndex);
		pageModel.setPageSize(pageSize);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("sessionUnitId");
		
		QueryParamWriter qpw = new QueryParamWriter();
		if(!StringUtil.isEmpty(managerUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+managerUnitId+"|%", QueryCondition.QC_LIKE);
		}
		
		if(!StringUtil.isEmpty(id)){
			qpw.addQueryParam("uid", Long.valueOf(id), QueryCondition.QC_EQ);
		}
		
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		busiAddressList = busiAddressService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		int recordCount = busiAddressService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		Gson gson = new Gson();
		if(busiAddressList != null){
			busiAddressListJson = gson.toJson(busiAddressList);
		}
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBusiAddressService(BusiAddressService busiAddressService) {
		this.busiAddressService = busiAddressService;
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

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public List<BusiAddressReturn> getBusiAddressList() {
		return busiAddressList;
	}

	public String getBusiAddressListJson() {
		return busiAddressListJson;
	}

}
