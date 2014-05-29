package com.ymsino.water.view.web.archives;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerReturn;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class GetWaterCustomerAjax extends AbstractAjaxAction {

	private String waterCustomerId;
	private WaterCustomerService waterCustomerService;

	@Override
	protected String setPageage() {
		return "com.ymsino.water.view.web.archives";
	}

	@Override
	protected String setResult() {
		
		JSONObject json = new JSONObject();
		if(StringUtil.isEmpty(waterCustomerId)){
			return json.toString();
		}
		WaterCustomerReturn waterCustomer = waterCustomerService.getById(waterCustomerId);
		if(waterCustomer != null){
			try {
				json.put("uid", waterCustomer.getUid().toString());
				json.put("userId", waterCustomer.getUserId());
				json.put("userName", waterCustomer.getUserName());
				json.put("nature", waterCustomer.getWaterNature());
				json.put("chargingUnitId", waterCustomer.getChargingUnitId());
				
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return json.toString();
	}

	public void setWaterCustomerId(String waterCustomerId) {
		this.waterCustomerId = waterCustomerId;
	}

	public void setWaterCustomerService(WaterCustomerService waterCustomerService) {
		this.waterCustomerService = waterCustomerService;
	}

}
