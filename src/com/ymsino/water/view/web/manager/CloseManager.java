package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.manager.ManagerService;

public class CloseManager extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String managerId;
	private String message = "";
	private ManagerService managerService;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(managerId)){
				message = "非法操作！";
			}
			boolean flag = managerService.closeStatus(managerId);
			if(flag){
				message = "停用成功！";
			}else{
				message = "停用失败！";
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

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}

}
