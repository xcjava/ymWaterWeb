package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterMeter.WaterMeterSaveParam;
import com.ymsino.water.service.archives.waterMeter.WaterMeterService;

public class SaveWaterMeter extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private String hardwareId;
	private String message;
	private WaterMeterService waterMeterService;
	private WaterMeterSaveParam waterMeter;
	private String curr;
	private String type;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(hardwareId)){
				message = "水表编号不能为空！";
				return SUCCESS;
			}
			waterMeter.setHardwareId(hardwareId);
			waterMeterService.save(waterMeter);
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

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public WaterMeterSaveParam getWaterMeter() {
		return waterMeter;
	}

	public void setWaterMeter(WaterMeterSaveParam waterMeter) {
		this.waterMeter = waterMeter;
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
