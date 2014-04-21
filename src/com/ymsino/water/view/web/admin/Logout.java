package com.ymsino.water.view.web.admin;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class Logout extends AbstractAjaxAction {

	@Override
	protected String setPageage() {
		return "com.gdcct.ec.admin.global";
	}
	
	@Override
	protected String setResult() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().removeAttribute("department");
		request.getSession().removeAttribute("manager");
		request.getSession().removeAttribute("chargingUnitId");
		return null;
	}


}
