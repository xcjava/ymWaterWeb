package com.ymsino.water.view.web.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;

public class Index extends ActionSupport {

	private static final long serialVersionUID = 1412873817615874989L;
	private String module = "archives";//默认进入档案模块
	
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		String managerStr = (String)session.getAttribute("manager");
		if(StringUtil.isEmpty(managerStr)){
			return "login";
		}
		return SUCCESS;
	}

}
