package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

import net.sf.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.department.DepartmentModifyParam;
import com.ymsino.water.service.manager.department.DepartmentReturn;
import com.ymsino.water.service.manager.department.DepartmentService;

public class UpdatePopedom extends ActionSupport {
	
	private static final long serialVersionUID = 3457033664419774464L;
	
	private DepartmentService departmentService;
	private String deptId;
	private String[] selectedOpers;
	private String message = "";
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(deptId)){
			message = "部门不存在！";
			return ERROR;
		}
		DepartmentReturn department = departmentService.getByDeptId(deptId);
		
		if(department == null){
			message = "部门不存在！";
			return ERROR;
		}
		Set<String> set = new HashSet<String>();
		for(String s : selectedOpers){
			set.add(s.split("[-]")[0]);
		}
		
		JSONObject json = new JSONObject();
		for(String s : set){
			String value = "";
			for(String p : selectedOpers){
				if(p.startsWith(s)){
					value += p.split("[-]")[1] + ",";
				}
			}
			value = value.substring(0, value.length()-1);
			json.put(s, value);
		}
		try {
			DepartmentModifyParam departmentModifyParam = new DepartmentModifyParam();
			departmentModifyParam.setDeptId(deptId);
			departmentModifyParam.setPopedomJson(json.toString());
			departmentService.modify(departmentModifyParam);
			message = "操作成功！";
		} catch (Exception e) {
			message = e.getMessage();
		}
		
		return SUCCESS;
	}

	public String[] getSelectedOpers() {
		return selectedOpers;
	}

	public void setSelectedOpers(String[] selectedOpers) {
		this.selectedOpers = selectedOpers;
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

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}


}
