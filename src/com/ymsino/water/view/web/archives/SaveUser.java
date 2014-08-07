package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.gmail.xcjava.base.date.DateUtil;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.user.UserSaveParam;
import com.ymsino.water.service.archives.user.UserService;
import com.ymsino.water.view.web.common.Arith;
import com.ymsino.water.view.web.common.PriceTool;

public class SaveUser extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private Long id;
	private String userId;
	private String message;
	private UserService userService;
	private UserSaveParam user;
	private String credValidDate;
	private String credInvalidDate;
	private String curr;
	private String warnPriceStr;//告警余额
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(userId)){
				return SUCCESS;
			}
			
			if(userService.getByUserId(userId) != null){
				message = "客户id已存在！";
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
			user.setUserId(userId);
			id = userService.save(user);
			message = "添加成功！";
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserSaveParam getUser() {
		return user;
	}

	public void setUser(UserSaveParam user) {
		this.user = user;
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

	public Long getId() {
		return id;
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
