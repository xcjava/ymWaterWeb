package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.manager.ManagerSaveParam;
import com.ymsino.water.service.manager.manager.ManagerService;

public class SaveManager extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String managerId;
	private String name;
	private String password;
	private String email;
	private String tel;
	private String departmentId;
	private String chargingUnitId;
	private String message;
	private ManagerService managerService;
	
	@SuppressWarnings("unused")
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String currentChargingUnitId = (String)session.getAttribute("chargingUnitId");
		try {
			if(StringUtil.isEmpty(managerId)){
				return SUCCESS;
			}
			if(managerService.getByManagerId(managerId) != null){
				message = "管理员id已存在！";
				return SUCCESS;
			}
			ManagerSaveParam managerSaveParam = new ManagerSaveParam();
			managerSaveParam.setManagerId(managerId);
			managerSaveParam.setPassword(password);
			managerSaveParam.setName(name);
			managerSaveParam.setEmail(email);
			managerSaveParam.setTel(tel);
			managerSaveParam.setDepartmentId(departmentId);
			managerSaveParam.setChargingUnitId(chargingUnitId);//保存管理员所在收费单位编号
			managerService.save(managerSaveParam);
			message = "添加成功！";
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
