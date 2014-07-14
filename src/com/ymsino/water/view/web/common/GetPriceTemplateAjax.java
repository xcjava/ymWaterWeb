package com.ymsino.water.view.web.common;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateReturn;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateService;

public class GetPriceTemplateAjax extends AbstractAjaxAction {

	private PriceTemplateService priceTemplateService;
	private String id;

	@Override
	protected String setPageage() {
		return "com.ymsino.water.manager";
	}

	@Override
	protected String setResult() {
		
		JSONObject json = new JSONObject();
		if(StringUtil.isEmpty(id)){
			return json.toString();
		}
		
		PriceTemplateReturn priceTemplate = priceTemplateService.getById(Long.valueOf(id));
		
		if(priceTemplate != null){
			try {
				json.put("ptId", priceTemplate.getId().toString());
				json.put("level1Num", priceTemplate.getLevel1Num());
				json.put("level2Num", priceTemplate.getLevel2Num());
				json.put("level3Num", priceTemplate.getLevel3Num());
				json.put("level4Num", priceTemplate.getLevel4Num());
				json.put("level1Cost", Arith.div(String.valueOf(priceTemplate.getLevel1Cost()), "100", 0));
				json.put("level2Cost", Arith.div(String.valueOf(priceTemplate.getLevel2Cost()), "100", 0));
				json.put("level3Cost", Arith.div(String.valueOf(priceTemplate.getLevel3Cost()), "100", 0));
				json.put("level4Cost", Arith.div(String.valueOf(priceTemplate.getLevel4Cost()), "100", 0));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return json.toString();
	}

	public void setPriceTemplateService(PriceTemplateService priceTemplateService) {
		this.priceTemplateService = priceTemplateService;
	}

	public void setId(String id) {
		this.id = id;
	}

}
