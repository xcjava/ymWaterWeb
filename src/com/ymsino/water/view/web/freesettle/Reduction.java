package com.ymsino.water.view.web.freesettle;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.freesettle.userWallet.UserWalletService;
import com.ymsino.water.view.web.common.Arith;
import com.ymsino.water.view.web.common.PriceTool;

public class Reduction extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private UserWalletService userWalletService;
	private String id;
	private String price;
	private String sysRemark;
	private String message = "";
	
	@Override
	public String execute() throws Exception {
		
		try {
			if(StringUtil.isEmpty(id)){
				message = "客户id不能为空！";
				return SUCCESS;
			}
			if(StringUtil.isEmpty(price)){
				message = "金额不能为空！";
				return SUCCESS;
			}
			userWalletService.deduction(Long.valueOf(id), Long.valueOf(PriceTool.subZeroAndDot(Arith.mul(price,"10000"))), sysRemark);
			message = "减费成功！";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSysRemark() {
		return sysRemark;
	}

	public void setSysRemark(String sysRemark) {
		this.sysRemark = sysRemark;
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

	public void setUserWalletService(UserWalletService userWalletService) {
		this.userWalletService = userWalletService;
	}

}
