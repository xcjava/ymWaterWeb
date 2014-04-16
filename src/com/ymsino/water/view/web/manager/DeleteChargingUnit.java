package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class DeleteChargingUnit extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String unitId;
	private String message = "";
	private ChargingUnitService chargingUnitService;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(unitId)){
				return null;
			}
			boolean flag = chargingUnitService.delete(unitId);
			if(flag){
				message = "删除成功！";
			}else{
				message = "删除失败！";
			}
		} catch (Exception e) {
			message = e.getMessage();
			e.printStackTrace();
		}
		return SUCCESS;
	}


	public String getUnitId() {
		return unitId;
	}


	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public void setMessage(String message) {
		this.message = message;
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


	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}
	
}
