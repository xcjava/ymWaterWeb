package com.ymsino.water.view.web.manager;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.service.manager.manager.ManagerService;

public class ManagerDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private ManagerService managerService;
	private ManagerReturn managerReturn = new ManagerReturn();
	private String managerId;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(managerId)){
			return SUCCESS;
		}
		managerReturn = managerService.getByManagerId(managerId);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ManagerReturn getManagerReturn() {
		return managerReturn;
	}

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

}
