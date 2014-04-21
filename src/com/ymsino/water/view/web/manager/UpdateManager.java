package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.manager.ManagerModifyParam;
import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.service.manager.manager.ManagerService;

public class UpdateManager extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String managerId;
	private String name;
	private String password;
	private String email;
	private String tel;
	private String departmentId;
	private String chargingUnitId;
	private String message = "";
	private ManagerService managerService;
	
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(managerId)){
				message = "管理员id不能为空！";
				return SUCCESS;
			}
			ManagerReturn managerReturn = managerService.getByManagerId(managerId);
			if(managerReturn == null){
				message = "管理员不存在！";
				return SUCCESS;
			}
			ManagerModifyParam managerModifyParam = new ManagerModifyParam();
			managerModifyParam.setManagerId(managerId);
			managerModifyParam.setPassword(password);
			managerModifyParam.setName(name);
			managerModifyParam.setEmail(email);
			managerModifyParam.setTel(tel);
			managerModifyParam.setDepartmentId(departmentId);
			managerModifyParam.setChargingUnitId(chargingUnitId);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getChargingUnitId() {
		return chargingUnitId;
	}

	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	
}
