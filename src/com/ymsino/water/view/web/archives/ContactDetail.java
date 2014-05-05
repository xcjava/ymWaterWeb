package com.ymsino.water.view.web.archives;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.gmail.xcjava.base.web.PageModel;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.contact.ContactReturn;
import com.ymsino.water.service.archives.contact.ContactService;
import com.ymsino.water.service.archives.contact.QueryParam;

public class ContactDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private ContactService contactService;
	private List<ContactReturn> contactList;
	private PageModel pageModel=new PageModel();
	private int pageIndex;
	private int pageSize;
	private String id;//这是客户id
	private String message;
	private String curr;
	
	@Override
	public String execute() throws Exception {
		if (pageIndex == 0) {pageIndex = 1;}
		if (pageSize == 0) {pageSize = 20;}
		pageModel.setPageIndex(pageIndex);
		pageModel.setPageSize(pageSize);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("chargingUnitId");
		
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
		contactList = contactService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		int recordCount = contactService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		
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

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
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

	public List<ContactReturn> getContactList() {
		return contactList;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

}
