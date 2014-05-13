package com.ymsino.water.view.web.archives;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gmail.xcjava.base.date.DateUtil;
import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryLink;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.concentrator.ConcentratorReturn;
import com.ymsino.water.service.archives.concentrator.ConcentratorService;
import com.ymsino.water.service.archives.concentrator.QueryParam;
import com.ymsino.water.view.web.common.PageModel;

public class ConcentratorList extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String chargingUnitId;			//收费单位id

	private String name; 			//集中器名称
	private String hardwareId;		//集中器ID
	private Long startTimestamp;	//启用日期
	private String startDate;
	private String endDate;
	private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int pageSize;
	
	private ConcentratorService concentratorService;
	
	private List<ConcentratorReturn> list = new ArrayList<ConcentratorReturn>();
	
	public String execute(){
		if (pageSize == 0)	pageSize = 20;
		if (pageIndex == 0)	pageIndex = 1;
		int recordCount=10;
		pageModel.setPageSize(pageSize);
		pageModel.setPageIndex(pageIndex);
		
		QueryParamWriter qpw = new QueryParamWriter();
		if(!StringUtil.isEmpty(chargingUnitId)){
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(name)){
			qpw.addQueryParam("name", name, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(hardwareId)){
			qpw.addQueryParam("hardwareId", hardwareId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(startDate) && !StringUtil.isEmpty(endDate)){
			if(DateUtil.parseDate(startDate, "yyyy-MM-dd").getTime() > DateUtil.parseDate(endDate , "yyyy-MM-dd").getTime()){
				Date date1 = DateUtil.parseDate(startDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
				Date date2 = DateUtil.parseDate(endDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
				qpw.addQueryParams(new String[]{"createTimestamp","createTimestamp"},  new Object[]{date2.getTime(),date1.getTime()} , new QueryCondition[]{QueryCondition.QC_GE,QueryCondition.QC_LE},new QueryLink[]{QueryLink.QL_AND});
			}else{
				Date date1 = DateUtil.parseDate(startDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
				Date date2 = DateUtil.parseDate(endDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
				qpw.addQueryParams(new String[]{"createTimestamp","createTimestamp"},  new Object[]{date1.getTime(),date2.getTime()} , new QueryCondition[]{QueryCondition.QC_GE,QueryCondition.QC_LE},new QueryLink[]{QueryLink.QL_AND});
			}
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = concentratorService.getListpager(qpm,pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = concentratorService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
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

	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
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



	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public String getEndDate() {
		return endDate;
	}



	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


}
