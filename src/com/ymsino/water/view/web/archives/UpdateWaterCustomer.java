package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerModifyParam;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerReturn;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerService;

public class UpdateWaterCustomer extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private WaterCustomerService waterCustomerService;
	private WaterCustomerModifyParam waterCustomer;
	private String customerId;
	private String message = "";
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(customerId)){
				message = "用水用户编号不能为空！";
				return SUCCESS;
			}
			WaterCustomerReturn waterCustomerReturn = waterCustomerService.getById(customerId);
			if(waterCustomerReturn == null){
				message = "用水用户编号不存在！";
				return SUCCESS;
			}
			waterCustomer.setCustomerId(customerId);
			waterCustomerService.modidy(waterCustomer);
			message = "修改成功！";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
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

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public WaterCustomerModifyParam getWaterCustomer() {
		return waterCustomer;
	}

	public void setWaterCustomer(WaterCustomerModifyParam waterCustomer) {
		this.waterCustomer = waterCustomer;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setWaterCustomerService(WaterCustomerService waterCustomerService) {
		this.waterCustomerService = waterCustomerService;
	}

}
