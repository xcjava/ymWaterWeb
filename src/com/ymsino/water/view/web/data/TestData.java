package com.ymsino.water.view.web.data;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.comm.testData.MeterDataVo;
import com.ymsino.water.service.comm.testData.TestDataService;

public class TestData extends ActionSupport {

	private static final long serialVersionUID = 6970850564906342550L;
	private TestDataService testDataService;
	private String wmSn;//水表对应集中器的编号
	private String concHardwareId;//集中器编号
	private String hardwareId;//水表编号
	private String message = "";
	private MeterDataVo meterDataVo;
    
	public String execute() throws Exception{
		try {
			if(StringUtil.isEmpty(concHardwareId)){
				message = "集中器编号不能为空！";
				return "check";
			}
			if(StringUtil.isEmpty(hardwareId)){
				message = "水表编号不能为空！";
				return "check";
			}
			if(StringUtil.isEmpty(wmSn)){
				message = "水表对应集中器的编号不能为空！";
				return "check";
			}
			meterDataVo = testDataService.testData(concHardwareId, hardwareId, Integer.valueOf(wmSn));
		} catch (Exception e) {
			message = e.getMessage();
			return "check";
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

	public String getConcHardwareId() {
		return concHardwareId;
	}

	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public void setWmSn(String wmSn) {
		this.wmSn = wmSn;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public MeterDataVo getMeterDataVo() {
		return meterDataVo;
	}

	public void setTestDataService(TestDataService testDataService) {
		this.testDataService = testDataService;
	}
	
}
