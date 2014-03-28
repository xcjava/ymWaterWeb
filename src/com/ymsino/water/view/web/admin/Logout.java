package com.ymsino.water.view.web.admin;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport {

	private static final long serialVersionUID = 4429446669649054769L;

	@Override
	public String execute() throws Exception {
		
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpSession session = request.getSession();
//		session.setAttribute("shopInfo", null);
		
		return SUCCESS;
	}


}
