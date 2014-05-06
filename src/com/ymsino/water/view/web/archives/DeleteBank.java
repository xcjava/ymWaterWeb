package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.bank.BankReturn;
import com.ymsino.water.service.archives.bank.BankService;

public class DeleteBank extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private BankService bankService;
	private String id;
	private String bankId;
	private String message = "";
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(bankId)){
				message = "银行信息id不能为空！";
				return SUCCESS;
			}
			BankReturn bankReturn = bankService.getById(Long.valueOf(bankId));
			if(bankReturn == null){
				message = "银行信息不存在！";
				return SUCCESS;
			}
			bankService.delete(Long.valueOf(bankId));
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

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public void setBankService(BankService bankService) {
		this.bankService = bankService;
	}

}
