package com.ymsino.water.view.web.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.service.manager.manager.ManagerService;
import com.ymsino.water.view.web.common.JsonUtil;

public class Header extends ActionSupport {

	private static final long serialVersionUID = 1412873817615874989L;
	private String module;
	private String currentNav;
	
	private ManagerReturn manager;
	private ManagerService managerService;
	
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
	
	public ManagerReturn getManager() {
		return manager;
	}
	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		String managerStr = (String)session.getAttribute("manager");
		ManagerReturn managerReturn = (ManagerReturn) JsonUtil.getObject(managerStr, ManagerReturn.class);
		manager = managerService.getByManagerId(managerReturn.getManagerId());
		return SUCCESS;
	}

}
