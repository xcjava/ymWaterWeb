package com.ymsino.water.view.web.manager;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class ChargingUnitDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private String unitId;
	private ChargingUnitService chargingUnitService;
	private ChargingUnitReturn chargingUnit;
	private String message;
	
	@Override
	public String execute() throws Exception {
		if(StringUtil.isEmpty(unitId)){
			return SUCCESS;
		}
		chargingUnit = chargingUnitService.getByUnitId(unitId.trim());
		return SUCCESS;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public ChargingUnitReturn getChargingUnit() {
		return chargingUnit;
	}

	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
