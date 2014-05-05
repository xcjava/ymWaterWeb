package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.busiAddress.BusiAddressReturn;
import com.ymsino.water.service.archives.busiAddress.BusiAddressService;

public class BusiAddressDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private BusiAddressService busiAddressService;
	private BusiAddressReturn busiAddress;
	private String id;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(id)){
			return SUCCESS;
		}
		busiAddress = busiAddressService.getById(Long.valueOf(id));
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

	public BusiAddressReturn getBusiAddress() {
		return busiAddress;
	}

	public void setBusiAddressService(BusiAddressService busiAddressService) {
		this.busiAddressService = busiAddressService;
	}

}
