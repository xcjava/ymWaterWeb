package com.ymsino.water.view.web.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;
import com.ymsino.water.service.manager.chargingUnit.QueryParam;
import com.ymsino.water.view.web.common.AbstractAjaxAction;

public class GetChargingUnitListAjax extends AbstractAjaxAction {

	private ChargingUnitService chargingUnitService;
	
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}

	@Override
	protected String setPageage() {
		return "com.ymsino.water.manager";
	}

	@Override
	protected String setResult() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String chargingUnitId = (String)session.getAttribute("chargingUnitId");
		
		JSONArray jsonArray = new JSONArray();
		List<ChargingUnitReturn> chargingUnitList = null;
		QueryParamWriter qpw = new QueryParamWriter();
		qpw.addQueryParam("status", Short.valueOf("1"), QueryCondition.QC_EQ);
		if(!StringUtil.isEmpty(chargingUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+chargingUnitId+"|%", QueryCondition.QC_LIKE);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		chargingUnitList = chargingUnitService.getListpager(qpm, 0, Integer.MAX_VALUE);
		
		if(chargingUnitList != null && chargingUnitList.size() > 0){
			for (ChargingUnitReturn chargingUnit:chargingUnitList) {
				try {
					JSONObject json = new JSONObject();
					json.put("unitId", chargingUnit.getUnitId());
					json.put("name", chargingUnit.getName());
					jsonArray.put(json);
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
		}
		return jsonArray.toString();
	}

}
