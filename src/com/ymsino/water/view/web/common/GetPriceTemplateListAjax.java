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
import com.ymsino.water.service.manager.priceTemplate.QueryParam;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateReturn;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateService;

public class GetPriceTemplateListAjax extends AbstractAjaxAction {

	private PriceTemplateService priceTemplateService;

	@Override
	protected String setPageage() {
		return "com.ymsino.water.manager";
	}

	@Override
	protected String setResult() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String chargingUnitId = (String)session.getAttribute("sessionUnitId");
		
		JSONArray jsonArray = new JSONArray();
		List<PriceTemplateReturn> priceTemplateList = null;
		QueryParamWriter qpw = new QueryParamWriter();
		if(!StringUtil.isEmpty(chargingUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+chargingUnitId+"|%", QueryCondition.QC_LIKE);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		priceTemplateList = priceTemplateService.getListpager(qpm, 0, Integer.MAX_VALUE);
		
		if(priceTemplateList != null && priceTemplateList.size() > 0){
			for (PriceTemplateReturn priceTemplate:priceTemplateList) {
				try {
					JSONObject json = new JSONObject();
					json.put("priceTemplateId", priceTemplate.getId());
					json.put("name", priceTemplate.getName());
					jsonArray.put(json);
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
		}
		return jsonArray.toString();
	}

	public void setPriceTemplateService(PriceTemplateService priceTemplateService) {
		this.priceTemplateService = priceTemplateService;
	}

}
