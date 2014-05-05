package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.contact.ContactReturn;
import com.ymsino.water.service.archives.contact.ContactService;

public class ContactDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private ContactService contactService;
	private ContactReturn contact;
	private String id;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(id)){
			return SUCCESS;
		}
		contact = contactService.getById(Long.valueOf(id));
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

	public ContactReturn getContact() {
		return contact;
	}

	public void setContact(ContactReturn contact) {
		this.contact = contact;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}

}
