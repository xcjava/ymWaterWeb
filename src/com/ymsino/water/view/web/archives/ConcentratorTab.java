package com.ymsino.water.view.web.archives;

import com.opensymphony.xwork2.ActionSupport;

public class ConcentratorTab extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String hardwareId;
	private String curr;
	private String message = "";
	
	public String execute() throws Exception{
		return SUCCESS;
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}
	

}
