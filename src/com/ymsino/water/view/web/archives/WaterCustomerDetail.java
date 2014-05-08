package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerReturn;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerService;

public class WaterCustomerDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private WaterCustomerService waterCustomerService;
	private WaterCustomerReturn waterCustomer;
	private String customerId;
	private String tab;
	private String curr;
	private String message;
	
	@Override
	public String execute() throws Exception {
		String result = "waterCustomer";
		if(!StringUtil.isEmpty(tab)){
			if("waterPoints".equals(tab)){
				result = "waterPoints";
			}
		}
		if(StringUtil.isEmpty(customerId)){
			return result;
		}
		waterCustomer = waterCustomerService.getById(customerId);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public WaterCustomerReturn getWaterCustomer() {
		return waterCustomer;
	}

	public void setWaterCustomerService(WaterCustomerService waterCustomerService) {
		this.waterCustomerService = waterCustomerService;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

}
