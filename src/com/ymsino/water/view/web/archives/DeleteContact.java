package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.contact.ContactReturn;
import com.ymsino.water.service.archives.contact.ContactService;

public class DeleteContact extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private ContactService contactService;
	private String id;//客户uid
	private String contactId;
	private String message = "";
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(contactId)){
				message = "联系信息id不能为空！";
				return SUCCESS;
			}
			ContactReturn contactReturn = contactService.getById(Long.valueOf(contactId));
			if(contactReturn == null){
				message = "联系信息不存在！";
				return SUCCESS;
			}
			contactService.delete(Long.valueOf(contactId));
			message = "删除成功！";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
	}

	public String getMessage() {
		if(!StringUtil.isEmpty(message)){
			try {
				message = URLEncoder.encode(message, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				message = "";
			}
		}
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

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

}
