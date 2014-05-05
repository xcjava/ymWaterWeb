package com.ymsino.water.view.web.data;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.collectTask.CollectTaskReturn;
import com.ymsino.water.service.data.collectTask.CollectTaskService;

public class CollectTaskDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private CollectTaskService collectTaskService;
	private CollectTaskReturn collectTask;
	private String id;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(id)){
			return SUCCESS;
		}
		collectTask = collectTaskService.getById(Long.valueOf(id));
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CollectTaskReturn getCollectTask() {
		return collectTask;
	}

	public void setCollectTask(CollectTaskReturn collectTask) {
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
