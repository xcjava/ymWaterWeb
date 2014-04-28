package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.user.UserReturn;
import com.ymsino.water.service.archives.user.UserService;

public class UserDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private UserService userService;
	private UserReturn user;
	private String id;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(id)){
			return SUCCESS;
		}
		user = userService.getById(Long.valueOf(id));
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserReturn getUser() {
		return user;
	}

	public void setUser(UserReturn user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
