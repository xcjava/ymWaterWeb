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
	private Short type;//水表类型，1：IC卡，2：红外卡，3：无线智能
	private String message;
	private String curr;
	
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

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

}
