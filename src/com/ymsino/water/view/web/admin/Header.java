package com.ymsino.water.view.web.admin;

import com.opensymphony.xwork2.ActionSupport;

public class Header extends ActionSupport {

	private static final long serialVersionUID = 1412873817615874989L;
	private String module;
	private String currentNav;
	public String getCurrentNav() {
		return currentNav;
	}
	public void setCurrentNav(String currentNav) {
		this.currentNav = currentNav;
	}
	
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
