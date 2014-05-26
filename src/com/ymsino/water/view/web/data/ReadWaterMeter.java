package com.ymsino.water.view.web.data;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.comm.loadWm.LoadWmService;
import com.ymsino.water.service.comm.loadWm.MeterSnVo;

public class ReadWaterMeter extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private LoadWmService loadWmService;
	private List<MeterSnVo> meterSnVoList;
	private String concHardwareId;
	private String wmSn;//开始水表编号
	private String count;//连续数量
	private String message = "";
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(concHardwareId)){
				message = "集中器编号不能为空！";
				return "check";
			}
			if(StringUtil.isEmpty(wmSn)){
				message = "开始水表编号不能为空！";
				return "check";
			}
			if(StringUtil.isEmpty(count)){
				message = "连续数量不能为空！";
				return "check";
			}
			meterSnVoList = loadWmService.readWaterMeterSn(concHardwareId, Integer.valueOf(wmSn), Integer.valueOf(count));
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

	public void setLoadWmService(LoadWmService loadWmService) {
		this.loadWmService = loadWmService;
	}

	public String getWmSn() {
		return wmSn;
	}

	public void setWmSn(String wmSn) {
		this.wmSn = wmSn;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public List<MeterSnVo> getMeterSnVoList() {
		return meterSnVoList;
	}

}
