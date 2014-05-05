package com.ymsino.water.view.web.archives;

import com.opensymphony.xwork2.ActionSupport;

public class UserInfoTab extends ActionSupport {

	private static final long serialVersionUID = 6970850564906342550L;
	
	private String id;
	private String curr;
	private String message = "";
	
	public String execute() throws Exception{
		return SUCCESS;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
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
	
}
