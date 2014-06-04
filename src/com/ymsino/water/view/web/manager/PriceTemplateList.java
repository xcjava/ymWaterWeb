package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.date.DateUtil;
import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryLink;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateReturn;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateService;
import com.ymsino.water.service.manager.priceTemplate.QueryParam;
import com.ymsino.water.view.web.common.PageModel;

public class PriceTemplateList extends ActionSupport {


	private static final long serialVersionUID = 6970850564906342550L;
	private PriceTemplateService priceTemplateService;
    private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int pageSize;
	private String id;//价目代码
	private String startDate;
	private String endDate;
	private String message = "";
    private List<PriceTemplateReturn> list = new ArrayList<PriceTemplateReturn>();
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
			qpw.addQueryParam("parentUnits", "%|"+managerUnitId+"|%", QueryCondition.QC_LIKE);
		}
		if(!StringUtil.isEmpty(id)){
			qpw.addQueryParam("id", Long.valueOf(id.trim()), QueryCondition.QC_EQ);
		}
		
		if(!StringUtil.isEmpty(startDate) && !StringUtil.isEmpty(endDate)){
			if(DateUtil.parseDate(startDate, "yyyy-MM-dd").getTime() > DateUtil.parseDate(endDate , "yyyy-MM-dd").getTime()){
				Date date1 = DateUtil.parseDate(startDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
				Date date2 = DateUtil.parseDate(endDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
				qpw.addQueryParams(new String[]{"startTimestamp","startTimestamp"},  new Object[]{date2.getTime(),date1.getTime()} , new QueryCondition[]{QueryCondition.QC_GE,QueryCondition.QC_LE},new QueryLink[]{QueryLink.QL_AND});
			}else{
				Date date1 = DateUtil.parseDate(startDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
				Date date2 = DateUtil.parseDate(endDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
				qpw.addQueryParams(new String[]{"startTimestamp","startTimestamp"},  new Object[]{date1.getTime(),date2.getTime()} , new QueryCondition[]{QueryCondition.QC_GE,QueryCondition.QC_LE},new QueryLink[]{QueryLink.QL_AND});
			}
		}
		
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = priceTemplateService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = priceTemplateService.getCount(qpm);
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
	
	public List<PriceTemplateReturn> getList() {
		return list;
	}


	public void setPriceTemplateService(PriceTemplateService priceTemplateService) {
		this.priceTemplateService = priceTemplateService;
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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
