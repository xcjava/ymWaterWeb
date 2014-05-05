package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.busiAddress.BusiAddressSaveParam;
import com.ymsino.water.service.archives.busiAddress.BusiAddressService;

public class SaveBusiAddress extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private Long id;
	private String userId;
	private String message;
	private BusiAddressService busiAddressService;
	private BusiAddressSaveParam busiAddress;
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(userId)){
				message = "客户id不能为空！";
				return SUCCESS;
			}
			
			id = busiAddressService.save(busiAddress);
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public Long getId() {
		return id;
	}

	public BusiAddressSaveParam getBusiAddress() {
		return busiAddress;
	}

	public void setBusiAddress(BusiAddressSaveParam busiAddress) {
		this.busiAddress = busiAddress;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBusiAddressService(BusiAddressService busiAddressService) {
		this.busiAddressService = busiAddressService;
	}

}
