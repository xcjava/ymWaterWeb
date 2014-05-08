package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.gmail.xcjava.base.date.DateUtil;
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
	private String openDate;
	private String closeDate;
	private String maturityDate;
	
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
			
			if(!StringUtil.isEmpty(openDate)){
				Long openTimestamp = DateUtil.parseDate(openDate, "yyyy-MM-dd").getTime();
				waterCustomer.setOpenTimestamp(openTimestamp);
			}
			if(!StringUtil.isEmpty(closeDate)){
				Long closeTimestamp = DateUtil.parseDate(closeDate, "yyyy-MM-dd").getTime();
				waterCustomer.setCloseTimestamp(closeTimestamp);
			}
			if(!StringUtil.isEmpty(maturityDate)){
				Long maturityTimestamp = DateUtil.parseDate(maturityDate, "yyyy-MM-dd").getTime();
				waterCustomer.setMaturityTimestamp(maturityTimestamp);
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

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public String getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

}
