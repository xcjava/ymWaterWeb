package com.ymsino.water.view.web.archives;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.concentrator.ConcentratorReturn;
import com.ymsino.water.service.archives.concentrator.ConcentratorService;
import com.ymsino.water.service.archives.concentrator.QueryParam;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;
import com.ymsino.water.view.web.common.PageModel;

public class ConcentratorList extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private ConcentratorService concentratorService;
	private ChargingUnitService chargingUnitService;
	private String chargingUnitId;	//收费单位id
	private String name; 			//集中器名称
	private String hardwareId;		//集中器ID
	private String status;
	private String tel;
	private String province;
	private String city;
	private String district;
	private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int pageSize;
	private List<ConcentratorReturn> list = new ArrayList<ConcentratorReturn>();
	private List<Map<String, Object>> mapList=new ArrayList<Map<String, Object>>();
	
	public String execute(){
		if (pageSize == 0)	pageSize = 20;
		if (pageIndex == 0)	pageIndex = 1;
		int recordCount=10;
		pageModel.setPageSize(pageSize);
		pageModel.setPageIndex(pageIndex);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("sessionUnitId");
		
		QueryParamWriter qpw = new QueryParamWriter();
		if(!StringUtil.isEmpty(managerUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+managerUnitId+"|%", QueryCondition.QC_LIKE);
		}
		
		if(!StringUtil.isEmpty(chargingUnitId)){
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(name)){
			qpw.addQueryParam("name", name, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(hardwareId)){
			qpw.addQueryParam("hardwareId", hardwareId, QueryCondition.QC_EQ);
		}
		
		if(!StringUtil.isEmpty(status)){
			qpw.addQueryParam("status", Short.valueOf(status), QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(tel)){
			qpw.addQueryParam("tel", tel, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(province)){
			qpw.addQueryParam("province", province, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(city)){
			qpw.addQueryParam("city", city, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(district)){
			qpw.addQueryParam("district", district, QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = concentratorService.getListpager(qpm,pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = concentratorService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		
		if(list != null && list.size()>0){
			for(ConcentratorReturn concentrator : list){
				Map<String, Object> map=new HashMap<String, Object>();
				
				ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(concentrator.getChargingUnitId());
				if (chargingUnit == null) {
					map.put("chargingUnit", null);
				}else{
					map.put("chargingUnit", chargingUnit);
				}
				mapList.add(map);
			}
		}
		
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public PageModel getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<ConcentratorReturn> getList() {
		return list;
	}

	public void setConcentratorService(ConcentratorService concentratorService) {
		this.concentratorService = concentratorService;
	}

	public String getChargingUnitId() {
		return chargingUnitId;
	}

	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}

	public List<Map<String, Object>> getMapList() {
		return mapList;
	}

	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
