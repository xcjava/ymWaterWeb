package com.ymsino.water.view.web.data;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.comm.deleteSettings.DeleteSettingsService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class DeleteSettingsAjax extends AbstractAjaxAction {

	private DeleteSettingsService deleteSettingsService;
	private String concHardwareId;
	

	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public void setDeleteSettingsService(DeleteSettingsService deleteSettingsService) {
		this.deleteSettingsService = deleteSettingsService;
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
			String code = deleteSettingsService.deleteSettings(concHardwareId);
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
