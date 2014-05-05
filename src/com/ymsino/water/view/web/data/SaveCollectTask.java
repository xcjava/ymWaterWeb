package com.ymsino.water.view.web.data;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.collectTask.CollectTaskSaveParam;
import com.ymsino.water.service.data.collectTask.CollectTaskService;

public class SaveCollectTask extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private Long id;
	private String message;
	private CollectTaskService collectTaskService;
	private CollectTaskSaveParam collectTask;
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			id = collectTaskService.save(collectTask);
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

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CollectTaskSaveParam getCollectTask() {
		return collectTask;
	}

	public void setCollectTask(CollectTaskSaveParam collectTask) {
		this.collectTask = collectTask;
	}

	public void setCollectTaskService(CollectTaskService collectTaskService) {
		this.collectTaskService = collectTaskService;
	}

}
