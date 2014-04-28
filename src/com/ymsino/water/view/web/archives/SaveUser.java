package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.user.UserSaveParam;
import com.ymsino.water.service.archives.user.UserService;

public class SaveUser extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private Long id;
	private String userId;
	private String message;
	private UserService userService;
	private UserSaveParam user;
	private String curr;
	
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

}
