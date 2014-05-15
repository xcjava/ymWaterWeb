package com.ymsino.water.view.web.freesettle;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.user.UserReturn;
import com.ymsino.water.service.archives.user.UserService;

public class CostPayDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private UserService userService;
	private UserReturn user;
	private String id;
	private String type;
	
	@Override
	public String execute() throws Exception {
		
		if(StringUtil.isEmpty(id)){
			return ERROR;
		}
		if(StringUtil.isEmpty(type)){
			return ERROR;
		}
		user = userService.getById(Long.valueOf(id));
		return type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
