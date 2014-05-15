package com.ymsino.water.view.web.freesettle;

import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.freesettle.userWallet.UserWalletReturn;
import com.ymsino.water.service.freesettle.userWallet.UserWalletService;
import com.ymsino.water.view.web.common.AbstractAjaxAction;
import com.ymsino.water.view.web.common.Arith;

public class GetUserBlanceAjax extends AbstractAjaxAction {

	private UserWalletService userWalletService;
	private String uid;

	@Override
	protected String setPageage() {
		return "com.ymsino.water.freesettle";
	}

	@Override
	protected String setResult() {
		
		JSONObject json = new JSONObject();
		if(StringUtil.isEmpty(uid)){
			return json.toString();
		}
		
		UserWalletReturn userWalletReturn = userWalletService.getByUid(Long.valueOf(uid));
		
		try {
			if(userWalletReturn != null){
				json.put("blance",Arith.div(userWalletReturn.getCashAmount(), 10000, 4)+"元");
			}else{
				json.put("blance", "0元");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return json.toString();
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setUserWalletService(UserWalletService userWalletService) {
		this.userWalletService = userWalletService;
	}

}
