package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.busiAddress.BusiAddressReturn;
import com.ymsino.water.service.archives.busiAddress.BusiAddressService;

public class DeleteBusiAddress extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private BusiAddressService busiAddressService;
	private String id;
	private String busiAddressId;
	private String message = "";
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(busiAddressId)){
				message = "业务地址id不能为空！";
				return SUCCESS;
			}
			BusiAddressReturn busiAddressReturn = busiAddressService.getById(Long.valueOf(busiAddressId));
			if(busiAddressReturn == null){
				message = "业务地址信息不存在！";
				return SUCCESS;
			}
			busiAddressService.delete(Long.valueOf(busiAddressId));
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public void setBusiAddressService(BusiAddressService busiAddressService) {
		this.busiAddressService = busiAddressService;
	}

	public String getBusiAddressId() {
		return busiAddressId;
	}

	public void setBusiAddressId(String busiAddressId) {
		this.busiAddressId = busiAddressId;
	}

}
