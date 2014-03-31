package com.ymsino.water.view.web.admin.interceptor;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.ymsino.water.service.manager.department.DepartmentReturn;
import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.view.web.common.JsonUtil;

public class Interceptor extends AbstractInterceptor {

	private static final long serialVersionUID = -2663263858655912533L;
	private String errorMessage;
	private String administrator;
	
	private String moduleCode = null;
	private String operaCode = null;
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerStr = (String)session.getAttribute("manager");
		
		if(StringUtil.isEmpty(managerStr))
			return "login";
		ManagerReturn manager = (ManagerReturn) JsonUtil.getObject(managerStr, ManagerReturn.class);
		if(manager == null)
			return "login";

		if(administrator.equals(manager.getManagerId()))
			return invocation.invoke();
			
		if(moduleCode == null && operaCode == null)
			return invocation.invoke();
		
		DepartmentReturn department = (DepartmentReturn) JsonUtil.getObject((String) session.getAttribute("department"), DepartmentReturn.class);
		String popedomJson = department.getPopedomJson();
		
		if(department != null && !popedomJson.isEmpty()){
			try {
				JSONObject json = JSONObject.fromObject(popedomJson);
				Iterator<String> it = json.keys();
				while(it.hasNext()){
					String key = it.next().toString();
					if(key.isEmpty() || !moduleCode.equals(key.trim()))
						continue;
					String p = json.getString(key);
					if(p.isEmpty())
						continue;
					
					String[] s = p.split(",");
					if(s.length == 0)
						continue;
					
					for(String str : s){
						if(!str.isEmpty() && operaCode.equals(str.trim()))
							return invocation.invoke();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		errorMessage = "该账号不具有该操作权限！";
		session.setAttribute("errorMessage", errorMessage);
		return "error";
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public void setOperaCode(String operaCode) {
		this.operaCode = operaCode;
	}
	
}
