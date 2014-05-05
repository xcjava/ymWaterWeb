package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.vat.VatReturn;
import com.ymsino.water.service.archives.vat.VatService;

public class VatDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private VatService vatService;
	private VatReturn vat;
	private String id;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(id)){
			return SUCCESS;
		}
		vat = vatService.getById(Long.valueOf(id));
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

	public VatReturn getVat() {
		return vat;
	}

	public void setVatService(VatService vatService) {
		this.vatService = vatService;
	}

}
