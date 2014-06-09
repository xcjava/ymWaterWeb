package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterMeter.WaterMeterModifyParam;
import com.ymsino.water.service.archives.waterMeter.WaterMeterReturn;
import com.ymsino.water.service.archives.waterMeter.WaterMeterService;
import com.ymsino.water.view.web.common.Arith;

public class UpdateWaterMeter extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private WaterMeterService waterMeterService;
	private WaterMeterModifyParam waterMeter;
	private String hardwareId;
	private String message = "";
	private String curr;
	private String type;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(hardwareId)){
				message = "水表编号不能为空！";
				return SUCCESS;
			}
			WaterMeterReturn waterMeterReturn = waterMeterService.getById(hardwareId);
			if(waterMeterReturn == null){
				message = "水表不存在！";
				return SUCCESS;
			}
			if(waterMeter.getPrice() != null){
				waterMeter.setPrice(Long.valueOf(Arith.mul(String.valueOf(waterMeter.getPrice()),"100")));
			}
			waterMeter.setHardwareId(hardwareId);
			waterMeterService.modify(waterMeter);
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

	public WaterMeterModifyParam getWaterMeter() {
		return waterMeter;
	}

	public void setWaterMeter(WaterMeterModifyParam waterMeter) {
		this.waterMeter = waterMeter;
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public void setWaterMeterService(WaterMeterService waterMeterService) {
		this.waterMeterService = waterMeterService;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
