package com.ymsino.water.view.web.searchAnalysis;

import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataModifyParam;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataService;

public class CheckingFreezeDataModify  extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CheckingFreezeDataService checkingFreezeDataService;
	private CheckingFreezeDataModifyParam modifyParam;
	public CheckingFreezeDataModifyParam getModifyParam() {
		return modifyParam;
	}


	private String message;
	private Boolean flag = false;
	
	
	public Boolean getFlag() {
		return flag;
	}


	public String getMessage() {
		return message;
	}


	public String execute() throws Exception{
		if(modifyParam!=null)
			flag = checkingFreezeDataService.modify(modifyParam);
		
		if(flag){
			//message=URLEncoder.encode("更新数据成功！", "UTF-8");
			message="更新数据成功！";
		}else{
			//message=URLEncoder.encode("数据更新异常！", "UTF-8");
			message="更新数据异常！";
		}
		return SUCCESS;
	}


	public void setCheckingFreezeDataService(
			CheckingFreezeDataService checkingFreezeDataService) {
		this.checkingFreezeDataService = checkingFreezeDataService;
	}


	public void setModifyParam(CheckingFreezeDataModifyParam modifyParam) {
		this.modifyParam = modifyParam;
	}
}
