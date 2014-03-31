package com.ymsino.water.view.web.admin;

import com.opensymphony.xwork2.ActionSupport;

public class Main extends ActionSupport {

	private static final long serialVersionUID = 1412873817615874989L;
	private String module;
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
