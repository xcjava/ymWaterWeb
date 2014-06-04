package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryLink;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;
import com.ymsino.water.service.manager.chargingUnit.QueryParam;
import com.ymsino.water.view.web.common.PageModel;

public class ChargingUnitList extends ActionSupport {


	private static final long serialVersionUID = 6970850564906342550L;
	private ChargingUnitService chargingUnitService;
    private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int pageSize;
	private String message = "";
	private String chargingUnitId;
	private String name;
	private String urlName;
	private String status;
    private List<ChargingUnitReturn> list = new ArrayList<ChargingUnitReturn>();
	public String execute() throws Exception, UnsupportedEncodingException{

		if (pageSize == 0)	pageSize = 20;
		if (pageIndex == 0)	pageIndex = 1;
		int recordCount=0;
		pageModel.setPageSize(pageSize);
		pageModel.setPageIndex(pageIndex);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("sessionUnitId");
		
		QueryParamWriter qpw = new QueryParamWriter();
		//根据当前管理员的收费单位查询
		if(!StringUtil.isEmpty(managerUnitId)){
			qpw.addQueryParams(new String[]{"unitId","parentUnits"}, new String[]{managerUnitId,"%|"+managerUnitId+"|%"}, new QueryCondition[]{QueryCondition.QC_EQ,QueryCondition.QC_LIKE},new QueryLink[]{QueryLink.QL_OR});
		}
		if(!StringUtil.isEmpty(name)){
			qpw.addQueryParam("name", "%"+name.trim()+"%", QueryCondition.QC_LIKE);
		}
		if(!StringUtil.isEmpty(status)){
			qpw.addQueryParam("status", Short.valueOf(status), QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(chargingUnitId)){
			chargingUnitId = chargingUnitId.trim();
			qpw.addQueryParam("parentUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = chargingUnitService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = chargingUnitService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		
		return SUCCESS;
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
	

	public List<ChargingUnitReturn> getList() {
		return list;
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


	public PageModel getPageModel() {
		return pageModel;
	}


	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrlName() {
		if(!StringUtil.isEmpty(name)){
			try {
				urlName = URLEncoder.encode(name, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				urlName = null;
			}
		}
		return urlName;
	}


	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getChargingUnitId() {
		return chargingUnitId;
	}


	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}
	
}
