package com.ymsino.water.view.web.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.department.DepartmentReturn;
import com.ymsino.water.service.manager.department.DepartmentService;
import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.service.manager.manager.ManagerService;
import com.ymsino.water.view.web.common.JsonUtil;

public class Login extends ActionSupport {

	private static final long serialVersionUID = 8041815294864575998L;

	private String managerId;
	private String password;
	private ManagerService managerService;
	private DepartmentService departmentService;
	
	private String message = "";
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		if(StringUtil.isEmpty(managerId) || StringUtil.isEmpty(password))
			return ERROR;
		ManagerReturn manager = managerService.login(managerId.trim(), password.trim());
		if(manager == null){
			message = "登录失败！";
			return ERROR;
		}
		DepartmentReturn department = departmentService.getByDeptId(manager.getDepartmentId());
		request.getSession().setAttribute("department", JsonUtil.getJSONString(department, null));
		request.getSession().setAttribute("manager", JsonUtil.getJSONString(manager, null));
		if("administrator".equals(managerId.trim()))
			request.getSession().setAttribute("sessionUnitId", "");
		else
			request.getSession().setAttribute("sessionUnitId", manager.getChargingUnitId());
			
		return SUCCESS;
	}

}
