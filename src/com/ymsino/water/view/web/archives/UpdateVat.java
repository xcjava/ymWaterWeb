package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.busiAddress.BusiAddressModifyParam;
import com.ymsino.water.service.archives.busiAddress.BusiAddressReturn;
import com.ymsino.water.service.archives.busiAddress.BusiAddressService;
import com.ymsino.water.service.archives.vat.VatModifyParam;
import com.ymsino.water.service.archives.vat.VatReturn;
import com.ymsino.water.service.archives.vat.VatService;

public class UpdateVat extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private VatService vatService;
	private VatModifyParam vat;
	private String id;
	private String message = "";
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(id)){
				message = "银行信息id不能为空！";
				return SUCCESS;
			}
			VatReturn vatReturn = vatService.getById(Long.valueOf(id));
			if(vatReturn == null){
				message = "业务地址信息不存在！";
				return SUCCESS;
			}
			vat.setId(Long.valueOf(id));
			vatService.modify(vat);
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

	public VatModifyParam getVat() {
		return vat;
	}

	public void setVat(VatModifyParam vat) {
		this.vat = vat;
	}

	public void setVatService(VatService vatService) {
		this.vatService = vatService;
	}

}
