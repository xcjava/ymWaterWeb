package com.ymsino.water.view.web.archives;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.concentrator.ConcentratorReturn;
import com.ymsino.water.service.archives.concentrator.ConcentratorService;

public class ConcentratorDetail extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String hardwareId;
	private String tab;
	private String message;
	private String curr;
	private ConcentratorService concentratorService;
	private ConcentratorReturn concentratorReturn;

	@Override
	public String execute() throws Exception {
		String result = "baseInfo";
		if(!StringUtil.isEmpty(tab)){
			if("simInfo".equals(tab)){
				result = "simInfo";
			}
			if("collectionInfo".equals(tab)){
				result = "collectionInfo";
			}
			if("collectionChannel".equals(tab)){
				result = "collectionChannel";
			}
			if("collectionObject".equals(tab)){
				result = "collectionObject";
			}
			if("collectionMeasure".equals(tab)){
				result = "collectionMeasure";
			}
			if("collectionUser".equals(tab)){
				result = "collectionUser";
			}
			if("runningTerminal".equals(tab)){
				result = "runningTerminal";
			}
		}
		if(StringUtil.isEmpty(hardwareId)){
			return result;
		}
		concentratorReturn = concentratorService.getById(hardwareId);
		return result;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ConcentratorReturn getConcentratorReturn() {
		return concentratorReturn;
	}

	public void setConcentratorService(ConcentratorService concentratorService) {
		this.concentratorService = concentratorService;
	}
}
