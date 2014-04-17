package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.department.DepartmentModifyParam;
import com.ymsino.water.service.manager.department.DepartmentReturn;
import com.ymsino.water.service.manager.department.DepartmentService;

public class UpdateDepartment extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String deptId;
	private String name;
	private String linkMan;
	private String linkTel;
	private String linkAddr;
	private String remark;
	private String message = "";
	private DepartmentService departmentService;
	
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(deptId)){
				message = "部门编号不能为空！";
				return SUCCESS;
			}
			DepartmentReturn departmentReturn = departmentService.getByDeptId(deptId);
			if(departmentReturn == null){
				return SUCCESS;
			}
			DepartmentModifyParam departmentModifyParam = new DepartmentModifyParam();
			departmentModifyParam.setLinkAddr(linkAddr);
			departmentModifyParam.setLinkMan(linkMan);
			departmentModifyParam.setLinkTel(linkTel);
			departmentModifyParam.setName(name);
			departmentModifyParam.setDeptId(deptId);
			departmentModifyParam.setRemark(remark);
			departmentService.modify(departmentModifyParam);
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

	public String getLinkMan() {
		return linkMan;
	}


	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}


	public String getLinkTel() {
		return linkTel;
	}


	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}


	public String getLinkAddr() {
		return linkAddr;
	}


	public void setLinkAddr(String linkAddr) {
		this.linkAddr = linkAddr;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
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
