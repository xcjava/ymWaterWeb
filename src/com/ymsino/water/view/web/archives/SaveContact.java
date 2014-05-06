package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.contact.ContactSaveParam;
import com.ymsino.water.service.archives.contact.ContactService;

public class SaveContact extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private String id;
	private String message;
	private ContactService contactService;
	private ContactSaveParam contact;
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(id)){
				message = "客户id不能为空！";
			}
			contact.setUid(Long.valueOf(id));
			contactService.save(contact);
			message = "添加成功！";
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

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public ContactSaveParam getContact() {
		return contact;
	}

	public void setContact(ContactSaveParam contact) {
		this.contact = contact;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}