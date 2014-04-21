package com.ymsino.water.view.web.manager;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateReturn;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateService;

public class PriceTemplateDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private PriceTemplateService priceTemplateService;
	private PriceTemplateReturn priceTemplate;
	private String id;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(id)){
			return SUCCESS;
		}
		priceTemplate = priceTemplateService.getById(Long.valueOf(id));
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PriceTemplateReturn getPriceTemplate() {
		return priceTemplate;
	}

	public void setPriceTemplate(PriceTemplateReturn priceTemplate) {
		this.priceTemplate = priceTemplate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPriceTemplateService(PriceTemplateService priceTemplateService) {
		this.priceTemplateService = priceTemplateService;
	}

}
