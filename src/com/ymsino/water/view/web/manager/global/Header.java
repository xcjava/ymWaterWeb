package com.ymsino.water.view.web.manager.global;

import com.opensymphony.xwork2.ActionSupport;

public class Header extends ActionSupport {

	private static final long serialVersionUID = 1412873817615874989L;

	private String currentNav;
	public String getCurrentNav() {
		return currentNav;
	}
	public void setCurrentNav(String currentNav) {
		this.currentNav = currentNav;
	}
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
