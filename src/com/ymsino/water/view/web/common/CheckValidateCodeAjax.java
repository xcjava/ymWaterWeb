package com.ymsino.water.view.web.common;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.json.JSONException;
import org.json.JSONObject;

public class CheckValidateCodeAjax extends AbstractAjaxAction {

	private String inputCode;
	private String sessionAttribute;
	
	@Override
	protected String setPageage() {
		return " com.shoei.pai.common";
	}

	@Override
	protected String setResult() {
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		String validateCode = (String) session.getAttribute(sessionAttribute);
		
		boolean isEqual = false;
		if(inputCode != null && !"".equals(inputCode) && inputCode.toLowerCase().equals(validateCode)) isEqual = true;
		
		JSONObject equalJSON = new JSONObject();
		
		try {
			equalJSON.put("isEqual", isEqual);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return equalJSON.toString();
	}

	public String getInputCode() {
		return inputCode;
	}

	public void setInputCode(String inputCode) {
		this.inputCode = inputCode;
	}

	public String getSessionAttribute() {
		return sessionAttribute;
	}

	public void setSessionAttribute(String sessionAttribute) {
		this.sessionAttribute = sessionAttribute;
	}

}
