package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterMeter.WaterMeterReturn;
import com.ymsino.water.service.archives.waterMeter.WaterMeterService;

public class WaterMeterDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private WaterMeterService waterMeterService;
	private WaterMeterReturn waterMeter;
	private String hardwareId;//水表编号
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(hardwareId)){
			return SUCCESS;
		}
		waterMeter = waterMeterService.getById(hardwareId);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public WaterMeterReturn getWaterMeter() {
		return waterMeter;
	}

	public void setWaterMeter(WaterMeterReturn waterMeter) {
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

}
