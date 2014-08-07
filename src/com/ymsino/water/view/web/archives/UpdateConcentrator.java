package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.gmail.xcjava.base.date.DateUtil;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.concentrator.ConcentratorModifyParam;
import com.ymsino.water.service.archives.concentrator.ConcentratorReturn;
import com.ymsino.water.service.archives.concentrator.ConcentratorService;
import com.ymsino.water.view.web.common.Arith;
import com.ymsino.water.view.web.common.PriceTool;

public class UpdateConcentrator extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private ConcentratorService concentratorService;
	private ConcentratorModifyParam concentrator;
	private String costDate;
	private String channelStartDate;
	private String hardwareId;
	private String message = "";
	private String curr;
	private String communicationCostStr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(hardwareId)){
				message = "集中器id不能为空！";
				return SUCCESS;
			}
			ConcentratorReturn concentratorReturn = concentratorService.getById(hardwareId);
			if(concentratorReturn == null){
				message = "集中器不存在！";
				return SUCCESS;
			}
			if(!StringUtil.isEmpty(costDate)){
				Long costTimestamp = DateUtil.parseDate(costDate, "yyyy-MM-dd").getTime();
				concentrator.setCostTimestamp(costTimestamp);
			}
			if(!StringUtil.isEmpty(channelStartDate)){
				Long startTimestamp = DateUtil.parseDate(channelStartDate, "yyyy-MM-dd").getTime();
				concentrator.setStartTimestamp(startTimestamp);
			}
			if(concentrator.getCommunicationCost() != null){
				concentrator.setCommunicationCost(Long.valueOf(Arith.mul(String.valueOf(concentrator.getCommunicationCost()),"10000")));
			}
			if(!StringUtil.isEmpty(communicationCostStr)){
				concentrator.setCommunicationCost(Long.valueOf(PriceTool.subZeroAndDot(Arith.mul(communicationCostStr.trim(),"10000"))));
			}
			concentrator.setHardwareId(hardwareId);
			concentratorService.modify(concentrator);
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

	public ConcentratorModifyParam getConcentrator() {
		return concentrator;
	}

	public void setConcentrator(ConcentratorModifyParam concentrator) {
		this.concentrator = concentrator;
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public void setConcentratorService(ConcentratorService concentratorService) {
		this.concentratorService = concentratorService;
	}

	public String getCostDate() {
		return costDate;
	}

	public void setCostDate(String costDate) {
		this.costDate = costDate;
	}

	public String getChannelStartDate() {
		return channelStartDate;
	}

	public void setChannelStartDate(String channelStartDate) {
		this.channelStartDate = channelStartDate;
	}

	public String getCommunicationCostStr() {
		return communicationCostStr;
	}

	public void setCommunicationCostStr(String communicationCostStr) {
		this.communicationCostStr = communicationCostStr;
	}

}
