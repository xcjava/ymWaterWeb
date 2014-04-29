package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.bank.BankReturn;
import com.ymsino.water.service.archives.bank.BankService;

public class BankDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private BankService bankService;
	private BankReturn bank;
	private String id;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(id)){
			return SUCCESS;
		}
		bank = bankService.getById(Long.valueOf(id));
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

	public BankReturn getBank() {
		return bank;
	}

	public void setBankService(BankService bankService) {
		this.bankService = bankService;
	}

}
