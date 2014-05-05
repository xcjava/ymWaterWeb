package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerSaveParam;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerService;

public class SaveWaterCustomer extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private String customerId;
	private String message;
	private WaterCustomerService waterCustomerService;
	private WaterCustomerSaveParam waterCustomer;
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(customerId)){
				message = "用水用户编号不能为空！";
				return SUCCESS;
			}
			waterCustomer.setCustomerId(customerId);
			waterCustomerService.save(waterCustomer);
			message = "添加成功！";
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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public WaterCustomerSaveParam getWaterCustomer() {
		return waterCustomer;
	}

	public void setWaterCustomer(WaterCustomerSaveParam waterCustomer) {
		this.waterCustomer = waterCustomer;
	}

	public void setWaterCustomerService(WaterCustomerService waterCustomerService) {
		this.waterCustomerService = waterCustomerService;
	}

}
