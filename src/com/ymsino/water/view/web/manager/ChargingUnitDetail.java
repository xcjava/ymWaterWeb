package com.ymsino.water.view.web.manager;

import java.util.ArrayList;
import java.util.List;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;
import com.ymsino.water.service.manager.chargingUnit.QueryParam;

public class ChargingUnitDetail extends ActionSupport{

	private static final long serialVersionUID = -7178675021248612349L;
	private String unitId;
	private ChargingUnitService chargingUnitService;
	private ChargingUnitReturn chargingUnit;
	private List<ChargingUnitReturn> parentUnitList = new ArrayList<ChargingUnitReturn>();
	private String message;
	
	@Override
	public String execute() throws Exception {
		QueryParamWriter qpw = new QueryParamWriter();
//		qpw.addQueryParam("status", Short.valueOf("1"), QueryCondition.QC_EQ);
		qpw.addQueryParam("unitId", unitId, QueryCondition.QC_UNEQ);
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		parentUnitList = chargingUnitService.getListpager(qpm,0, Integer.MAX_VALUE);
		/*if(chargingUnit != null && !StringUtil.isEmpty(chargingUnit.getParentUnits())){
			List<String> parentUnits = com.gmail.xcjava.base.str.StringTool.split(chargingUnit.getParentUnits(), "|");
			if(parentUnits !=null && parentUnits.size()>0){
				for(String unitId : parentUnits){
					ChargingUnitReturn parentUnit = chargingUnitService.getByUnitId(unitId);
					parentUnitList.add(parentUnit);
				}
			}
		}*/
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

	public List<ChargingUnitReturn> getParentUnitList() {
		return parentUnitList;
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
