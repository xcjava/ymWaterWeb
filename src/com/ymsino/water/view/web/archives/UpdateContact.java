package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.contact.ContactModifyParam;
import com.ymsino.water.service.archives.contact.ContactReturn;
import com.ymsino.water.service.archives.contact.ContactService;

public class UpdateContact extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private ContactService contactService;
	private ContactModifyParam contact;
	private String id;
	private String message = "";
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(id)){
				message = "银行信息id不能为空！";
				return SUCCESS;
			}
			ContactReturn contactReturn = contactService.getById(Long.valueOf(id));
			if(contactReturn == null){
				message = "业务地址信息不存在！";
				return SUCCESS;
			}
			contact.setId(Long.valueOf(id));
			contactService.modify(contact);
			message = "修改成功！";
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

	public ContactModifyParam getContact() {
		return contact;
	}

	public void setContact(ContactModifyParam contact) {
		this.contact = contact;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}

}
