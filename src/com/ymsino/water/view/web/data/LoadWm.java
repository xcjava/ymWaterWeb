package com.ymsino.water.view.web.data;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.comm.loadWm.LoadWmService;

public class LoadWm extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private LoadWmService loadWmService;
	private String concHardwareId;
	private String message = "";
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(concHardwareId)){
				message = "集中器编号不能为空！";
				return SUCCESS;
			}
			boolean flag = loadWmService.loadWm(concHardwareId);
			if(flag)
				message = "加载成功！";
			else
				message = "加载失败！";
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

	public String getConcHardwareId() {
		return concHardwareId;
	}

	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public void setLoadWmService(LoadWmService loadWmService) {
		this.loadWmService = loadWmService;
	}

}
