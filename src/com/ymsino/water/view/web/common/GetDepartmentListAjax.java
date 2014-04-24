package com.ymsino.water.view.web.common;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.ymsino.water.service.manager.department.DepartmentReturn;
import com.ymsino.water.service.manager.department.DepartmentService;
import com.ymsino.water.service.manager.department.QueryParam;

public class GetDepartmentListAjax extends AbstractAjaxAction {

	private String unitId;
	private DepartmentService departmentService;

	@Override
	protected String setPageage() {
		return "com.ymsino.water.manager";
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@Override
	protected String setResult() {
		
		JSONArray jsonArray = new JSONArray();
		if(StringUtil.isEmpty(unitId)){
			return jsonArray.toString();
		}
		List<DepartmentReturn> departmentList = null;
		QueryParamWriter qpw = new QueryParamWriter();
		qpw.addQueryParam("status", Short.valueOf("1"), QueryCondition.QC_EQ);
		qpw.addQueryParam("chargingUnitId", unitId, QueryCondition.QC_EQ);
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		departmentList = departmentService.getListpager(qpm, 0, Integer.MAX_VALUE);
		
		if(departmentList != null && departmentList.size() > 0){
			for (DepartmentReturn department:departmentList) {
				try {
					JSONObject json = new JSONObject();
					json.put("deptId", department.getDeptId());
					json.put("name", department.getName());
					jsonArray.put(json);
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
		}
		return jsonArray.toString();
	}

}
