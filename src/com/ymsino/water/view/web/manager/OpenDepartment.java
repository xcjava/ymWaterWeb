package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.department.DepartmentService;

public class OpenDepartment extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String deptId;
	private String message = "";
	private DepartmentService departmentService;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(deptId)){
				return null;
			}
			boolean flag = departmentService.openStatus(deptId);
			if(flag){
				message = "启用成功！";
			}else{
				message = "启用失败！";
			}
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
}
