package com.ymsino.water.view.web.manager;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.department.DepartmentReturn;
import com.ymsino.water.service.manager.department.DepartmentService;

public class DepartmentDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private DepartmentService departmentService;
	private DepartmentReturn department = new DepartmentReturn();
	private String deptId;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(deptId)){
			return SUCCESS;
		}
		department = departmentService.getByDeptId(deptId);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DepartmentReturn getDepartment() {
		return department;
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
