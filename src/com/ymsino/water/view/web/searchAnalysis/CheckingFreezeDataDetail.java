package com.ymsino.water.view.web.searchAnalysis;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataReturn;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataService;

public class CheckingFreezeDataDetail  extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private CheckingFreezeDataReturn cfdReturn;
	private CheckingFreezeDataService checkingFreezeDataService;
	private List<String> intList = new ArrayList<String>();
	
	
	public String execute(){
		if(id!=null)
			cfdReturn = checkingFreezeDataService.getById(id);
		String str = "meterReading";
		for(int i=1;i<=31;i++)
			intList.add(str+i);
		
		return SUCCESS;
	}


	public CheckingFreezeDataReturn getCfdReturn() {
		return cfdReturn;
	}


	public List<String> getIntList() {
		return intList;
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
