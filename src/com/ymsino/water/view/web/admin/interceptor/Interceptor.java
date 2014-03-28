package com.ymsino.water.view.web.admin.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Interceptor extends AbstractInterceptor {

	private static final long serialVersionUID = -2663263858655912533L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpSession session = request.getSession();
//		
//		User user = (User) session.getAttribute("shopInfo");
//		if(user != null){
			return invocation.invoke();
//		}
//		return "login";
	}
}
