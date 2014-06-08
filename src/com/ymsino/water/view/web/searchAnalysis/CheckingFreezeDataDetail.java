package com.ymsino.water.view.web.searchAnalysis;

import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataReturn;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataService;

public class CheckingFreezeDataDetail  extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private CheckingFreezeDataReturn checkingFreezeData;
	private CheckingFreezeDataService checkingFreezeDataService;
	
	public String execute(){
		if(id!=null){
			checkingFreezeData = checkingFreezeDataService.getById(id);
		}
		return SUCCESS;
	}

	public CheckingFreezeDataReturn getCheckingFreezeData() {
		return checkingFreezeData;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setCheckingFreezeDataService(
			CheckingFreezeDataService checkingFreezeDataService) {
		this.checkingFreezeDataService = checkingFreezeDataService;
	}
}
