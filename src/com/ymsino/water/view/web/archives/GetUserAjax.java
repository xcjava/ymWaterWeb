package com.ymsino.water.view.web.archives;

import java.util.Random;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.archives.user.UserReturn;
import com.ymsino.water.service.archives.user.UserService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class GetUserAjax extends AbstractAjaxAction {

	private String userId;
	private UserService userService;

	@Override
	protected String setPageage() {
		return "com.ymsino.water.view.web.archives";
	}

	@Override
	protected String setResult() {
		
		JSONObject json = new JSONObject();
		if(StringUtil.isEmpty(userId)){
			return json.toString();
		}
		UserReturn user = userService.getById(Long.valueOf(userId));
		if(user != null){
			try {
				int i= new Random().nextInt(900)+100;
				json.put("userId", user.getUserId());
				json.put("userName", user.getName());
				json.put("waterCustomerId", "W_"+user.getUserId()+"_"+i);
				json.put("chargingUnitId", user.getChargingUnitId());
				
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return json.toString();
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
