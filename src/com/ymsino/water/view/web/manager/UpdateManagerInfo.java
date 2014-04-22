package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.department.DepartmentModifyParam;
import com.ymsino.water.service.manager.department.DepartmentReturn;
import com.ymsino.water.service.manager.department.DepartmentService;
import com.ymsino.water.service.manager.manager.ManagerModifyParam;
import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.service.manager.manager.ManagerService;

public class UpdateManagerInfo extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String managerId;
	private String name;
	private String oldPwd;
	private String newPwd;
	private String message = "";
	private ManagerService managerService;
	
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(managerId)){
				message = "管理员id不能为空！";
				return SUCCESS;
			}
			ManagerReturn manager = managerService.login(managerId, oldPwd);
			if(manager == null){
				message = "原密码错误！";
				return SUCCESS;
			}
			ManagerModifyParam managerModifyParam = new ManagerModifyParam();
			managerModifyParam.setManagerId(managerId);
			managerModifyParam.setName(name.trim());
			managerModifyParam.setPassword(newPwd);
			managerService.modify(managerModifyParam);
			message = "修改成功！";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public ManagerService getManagerService() {
		return managerService;
	}

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
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
	
}
