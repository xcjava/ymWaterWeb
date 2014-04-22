package com.ymsino.water.view.web.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.service.manager.manager.ManagerService;
import com.ymsino.water.view.web.common.JsonUtil;

public class ManagerInfo extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private ManagerReturn manager;
	private ManagerService managerService;
	
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		String managerStr = (String)session.getAttribute("manager");
		ManagerReturn managerReturn = (ManagerReturn) JsonUtil.getObject(managerStr, ManagerReturn.class);
		manager = managerService.getByManagerId(managerReturn.getManagerId());
		return SUCCESS;
	}

	public ManagerReturn getManager() {
		return manager;
	}

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}

}
