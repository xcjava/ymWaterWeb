package com.ymsino.water.view.web.data;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.comm.conClock.ConClockService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;
import com.ymsino.water.view.web.common.DateUtil;

public class ReadClockAjax extends AbstractAjaxAction {

	private ConClockService conClockService;
	private String concHardwareId;
	

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
			if(StringUtil.isEmpty(concHardwareId)){
				json.put("errorMsg","集中器逻辑地址为空");
				return json.toString();
			}
			json.put("isFail", false);
			String dateStr =conClockService.readClock(concHardwareId);
			json.put("date", DateUtil.format(DateUtil.parseDate(dateStr, "yyMMddHHmmss"), "yyyy-MM-dd HH:mm:ss"));
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
