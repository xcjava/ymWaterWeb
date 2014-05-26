package com.ymsino.water.view.web.data;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.comm.restoreSetting.RestoreSettingService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class RestoreSettingsAjax extends AbstractAjaxAction {

	private RestoreSettingService restoreSettingService;
	private String concHardwareId;
	

	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public void setRestoreSettingService(RestoreSettingService restoreSettingService) {
		this.restoreSettingService = restoreSettingService;
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
			String code = restoreSettingService.restoreSettings(concHardwareId);
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
