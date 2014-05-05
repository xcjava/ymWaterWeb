package com.ymsino.water.view.web.data;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.collectTask.CollectTaskModifyParam;
import com.ymsino.water.service.data.collectTask.CollectTaskReturn;
import com.ymsino.water.service.data.collectTask.CollectTaskService;

public class UpdateCollectTask extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private CollectTaskService collectTaskService;
	private CollectTaskModifyParam collectTask;
	private String id;
	private String message = "";
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(id)){
				message = "采集任务编号不能为空！";
				return SUCCESS;
			}
			CollectTaskReturn collectTaskReturn = collectTaskService.getById(Long.valueOf(id));
			if(collectTaskReturn == null){
				message = "采集任务编号不存在！";
				return SUCCESS;
			}
			collectTask.setId(Long.valueOf(id));
			collectTaskService.modify(collectTask);
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

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public CollectTaskModifyParam getCollectTask() {
		return collectTask;
	}

	public void setCollectTask(CollectTaskModifyParam collectTask) {
		this.collectTask = collectTask;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCollectTaskService(CollectTaskService collectTaskService) {
		this.collectTaskService = collectTaskService;
	}

}
