package com.ymsino.water.view.web.data;

import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;

import com.gmail.xcjava.base.date.DateUtil;
import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.comm.conClock.ConClockService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class SetupClockAjax extends AbstractAjaxAction {

	private ConClockService conClockService;
	private String concHardwareId;
	private String setupDate;
	private String hour;
	private String minute;
	private String second;
	
	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public void setConClockService(ConClockService conClockService) {
		this.conClockService = conClockService;
	}

	public void setSetupDate(String setupDate) {
		this.setupDate = setupDate;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public void setSecond(String second) {
		this.second = second;
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
			
			if(StringUtil.isEmpty(concHardwareId) || StringUtil.isEmpty(setupDate)
					|| StringUtil.isEmpty(hour) || StringUtil.isEmpty(minute) || 
					StringUtil.isEmpty(second)){
				return json.toString();
			}
			
			Date date = DateUtil.parseDate(setupDate+" "+hour+":"+minute+":"+second, "yyyy-MM-dd HH:mm:ss");
			String dateStr = DateUtil.formatDate(date, "yyMMddHHmmss");
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
