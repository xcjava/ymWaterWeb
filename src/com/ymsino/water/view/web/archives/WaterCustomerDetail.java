package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerReturn;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerService;

public class WaterCustomerDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private WaterCustomerService waterCustomerService;
	private WaterCustomerReturn waterCustomer;
	private String id;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(id)){
			return SUCCESS;
		}
		waterCustomer = waterCustomerService.getById(id);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public WaterCustomerReturn getWaterCustomer() {
		return waterCustomer;
	}

	public void setWaterCustomerService(WaterCustomerService waterCustomerService) {
		this.waterCustomerService = waterCustomerService;
	}

}
