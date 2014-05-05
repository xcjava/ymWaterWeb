package com.ymsino.water.view.web.data;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.comm.conDebug.ConDebugService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class ConDebugAjax extends AbstractAjaxAction {

	private ConDebugService conDebugService;
	private String concHardwareId;
	private String waterMeterId;//水表编号
	private String waterMeterSn;//水表对应集中器编号

	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public void setWaterMeterId(String waterMeterId) {
		this.waterMeterId = waterMeterId;
	}

	public void setWaterMeterSn(String waterMeterSn) {
		this.waterMeterSn = waterMeterSn;
	}

	public void setConDebugService(ConDebugService conDebugService) {
		this.conDebugService = conDebugService;
	}

	@Override
	protected String setPageage() {
		return "com.ymsino.water.data";
	}

	@Override
	protected String setResult() {
		
		JSONObject json = new JSONObject();
			
		try {
			json.put("isFail", true);
			
			if(StringUtil.isEmpty(concHardwareId))
				return json.toString();
			String code = conDebugService.debug(concHardwareId, waterMeterId, Integer.valueOf(waterMeterSn));
			if("00".equals(code)){
				json.put("isFail", false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				json.put("isFail", true);
				json.put("errorMsg", e.getMessage());
			} catch (JSONException e1) {
				e1.printStackTrace();
			}
			return json.toString();
		}
		return json.toString();
	}

}
