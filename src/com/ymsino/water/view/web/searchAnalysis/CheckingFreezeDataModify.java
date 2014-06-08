package com.ymsino.water.view.web.searchAnalysis;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataModifyParam;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataReturn;
import com.ymsino.water.service.data.checkingFreezeData.CheckingFreezeDataService;

public class CheckingFreezeDataModify  extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private CheckingFreezeDataService checkingFreezeDataService;
	private CheckingFreezeDataModifyParam checkingFreezeData;
	private String id;
	private String message;

	public String execute() throws Exception{
		try {
			if(StringUtil.isEmpty(id)){
				message = "审核冻结数据id不能为空！";
				return SUCCESS;
			}
			CheckingFreezeDataReturn checkingFreezeDataReturn = checkingFreezeDataService.getById(Long.valueOf(id));
			if(checkingFreezeDataReturn == null){
				message = "审核冻结数据不存在！";
				return SUCCESS;
			}
			checkingFreezeData.setId(Long.valueOf(id));
			boolean flag = checkingFreezeDataService.modify(checkingFreezeData);
			if(flag){
				message="更新数据成功！";
			}else{
				message="更新数据异常！";
			}
			return SUCCESS;
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
	}

	public void setCheckingFreezeDataService(
			CheckingFreezeDataService checkingFreezeDataService) {
		this.checkingFreezeDataService = checkingFreezeDataService;
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

	public CheckingFreezeDataModifyParam getCheckingFreezeData() {
		return checkingFreezeData;
	}

	public void setCheckingFreezeData(CheckingFreezeDataModifyParam checkingFreezeData) {
		this.checkingFreezeData = checkingFreezeData;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
