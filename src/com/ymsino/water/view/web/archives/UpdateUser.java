package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.gmail.xcjava.base.date.DateUtil;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.user.UserModifyParam;
import com.ymsino.water.service.archives.user.UserReturn;
import com.ymsino.water.service.archives.user.UserService;
import com.ymsino.water.view.web.common.Arith;
import com.ymsino.water.view.web.common.PriceTool;

public class UpdateUser extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private UserService userService;
	private UserModifyParam user;
	private String id;
	private String message = "";
	private String credValidDate;
	private String credInvalidDate;
	private String curr;
	private String warnPriceStr;//告警余额
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(id)){
				message = "客户id不能为空！";
				return SUCCESS;
			}
			UserReturn userReturn = userService.getById(Long.valueOf(id));
			if(userReturn == null){
				message = "客户信息不存在！";
				return SUCCESS;
			}
			if(!StringUtil.isEmpty(credValidDate)){
				Long credValidTimestamp = DateUtil.parseDate(credValidDate, "yyyy-MM-dd").getTime();
				user.setCredValidTimestamp(credValidTimestamp);
			}
			if(!StringUtil.isEmpty(credInvalidDate)){
				Long credInvalidTimestamp = DateUtil.parseDate(credInvalidDate, "yyyy-MM-dd").getTime();
				user.setCredInvalidTimestamp(credInvalidTimestamp);
			}
			if(!StringUtil.isEmpty(warnPriceStr)){
				user.setWarnPrice(Long.valueOf(PriceTool.subZeroAndDot(Arith.mul(warnPriceStr.trim(),"10000"))));
			}
			user.setId(Long.valueOf(id));
			userService.modify(user);
			message = "修改成功！";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
	}

	public String getMessage() {
		if(!StringUtil.isEmpty(message)){
			try {
				message = URLEncoder.encode(message, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				message = "";
			}
		}
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserModifyParam getUser() {
		return user;
	}

	public void setUser(UserModifyParam user) {
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getCredValidDate() {
		return credValidDate;
	}

	public void setCredValidDate(String credValidDate) {
		this.credValidDate = credValidDate;
	}

	public String getCredInvalidDate() {
		return credInvalidDate;
	}

	public void setCredInvalidDate(String credInvalidDate) {
		this.credInvalidDate = credInvalidDate;
	}

	public String getWarnPriceStr() {
		return warnPriceStr;
	}

	public void setWarnPriceStr(String warnPriceStr) {
		this.warnPriceStr = warnPriceStr;
	}
	
}
