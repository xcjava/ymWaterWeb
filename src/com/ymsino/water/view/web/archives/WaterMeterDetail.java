package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerReturn;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerService;
import com.ymsino.water.service.archives.waterMeter.WaterMeterReturn;
import com.ymsino.water.service.archives.waterMeter.WaterMeterService;

public class WaterMeterDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private WaterMeterService waterMeterService;
	private WaterCustomerService waterCustomerService;
	private WaterMeterReturn waterMeter;
	private String hardwareId;//水表编号
	private String type;//水表类型，1：IC卡，2：红外卡，3：无线智能
	private String message;
	private String curr;
	private Long priceTemplateId;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(hardwareId)){
			return SUCCESS;
		}
		waterMeter = waterMeterService.getById(hardwareId);
		if(waterMeter != null){
			WaterCustomerReturn waterCustomer = waterCustomerService.getById(waterMeter.getWaterCustomerId());
			if(waterCustomer != null)
				priceTemplateId = waterCustomer.getPriceTemplateId();
		}
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public Long getPriceTemplateId() {
		return priceTemplateId;
	}

	public void setWaterCustomerService(WaterCustomerService waterCustomerService) {
		this.waterCustomerService = waterCustomerService;
	}

}
