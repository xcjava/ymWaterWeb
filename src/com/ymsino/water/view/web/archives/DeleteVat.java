package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.vat.VatReturn;
import com.ymsino.water.service.archives.vat.VatService;

public class DeleteVat extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private VatService vatService;
	private String id;//客户uid
	private String vatId;
	private String message = "";
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(vatId)){
				message = "增值税id不能为空！";
				return SUCCESS;
			}
			VatReturn vatReturn = vatService.getById(Long.valueOf(vatId));
			if(vatReturn == null){
				message = "增值税信息不存在！";
				return SUCCESS;
			}
			vatService.delete(Long.valueOf(vatId));
			message = "删除成功！";
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

	public String getVatId() {
		return vatId;
	}

	public void setVatId(String vatId) {
		this.vatId = vatId;
	}

	public void setVatService(VatService vatService) {
		this.vatService = vatService;
	}

}
