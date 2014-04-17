package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.department.DepartmentSaveParam;
import com.ymsino.water.service.manager.department.DepartmentService;

public class SaveDepartment extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String deptId;
	private String name;
	private String parentDeptId;
	private String linkMan;
	private String linkTel;
	private String linkAddr;
	private String remark;
	private String message;
	private DepartmentService departmentService;
	
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String chargingUnitId = (String)session.getAttribute("chargingUnitId");
		try {
			if(StringUtil.isEmpty(deptId)){
				return SUCCESS;
			}
			if(departmentService.getByDeptId(deptId) != null){
				message = "部门编号已存在！";
				return SUCCESS;
			}
			DepartmentSaveParam departmentSaveParam = new DepartmentSaveParam();
			departmentSaveParam.setDeptId(deptId);
			departmentSaveParam.setLinkAddr(linkAddr);
			departmentSaveParam.setLinkMan(linkMan);
			departmentSaveParam.setLinkTel(linkTel);
			departmentSaveParam.setName(name);
			departmentSaveParam.setParentDeptId(parentDeptId);
			departmentSaveParam.setChargingUnitId(chargingUnitId);//保存管理员所在收费单位编号
			departmentSaveParam.setRemark(remark);
			departmentService.save(departmentSaveParam);
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

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getParentDeptId() {
		return parentDeptId;
	}

	public void setParentDeptId(String parentDeptId) {
		this.parentDeptId = parentDeptId;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
}
