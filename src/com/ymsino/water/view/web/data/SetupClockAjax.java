package com.ymsino.water.view.web.data;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.comm.conClock.ConClockService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class SetupClockAjax extends AbstractAjaxAction {

	private ConClockService conClockService;
	private String concHardwareId;
	private String dateStr;
	

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public void setConClockService(ConClockService conClockService) {
		this.conClockService = conClockService;
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
			
			if(StringUtil.isEmpty(concHardwareId) || StringUtil.isEmpty(dateStr))
				return json.toString();
			String code =conClockService.setupClock(concHardwareId, dateStr);
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
