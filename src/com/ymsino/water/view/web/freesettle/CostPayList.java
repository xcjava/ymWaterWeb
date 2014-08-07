package com.ymsino.water.view.web.freesettle;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.date.DateUtil;
import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryLink;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.user.QueryParam;
import com.ymsino.water.service.archives.user.UserReturn;
import com.ymsino.water.service.archives.user.UserService;
import com.ymsino.water.service.freesettle.userWallet.UserWalletReturn;
import com.ymsino.water.service.freesettle.userWallet.UserWalletService;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;
import com.ymsino.water.view.web.common.Arith;
import com.ymsino.water.view.web.common.PageModel;
import com.ymsino.water.view.web.common.PriceTool;

public class CostPayList extends ActionSupport {


	private static final long serialVersionUID = 6970850564906342550L;
	private UserService userService;
	private ChargingUnitService chargingUnitService;
	private UserWalletService userWalletService;
    private String userId = null;
    private String name;
    private String economicType;//经济类型
    private String industrial;//产业分类
    private String startDate;
	private String endDate;
    private String chargingUnitId = null;
    private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int recordCount;
	private int pageSize;
	private String message = "";
    private List<UserReturn> list = new ArrayList<UserReturn>();
    private List<Map<String, Object>> mapList=new ArrayList<Map<String, Object>>();
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
		if(!StringUtil.isEmpty(managerUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+managerUnitId+"|%", QueryCondition.QC_LIKE);
		}
		if(!StringUtil.isEmpty(userId)){
			qpw.addQueryParam("userId", userId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(chargingUnitId)){
			chargingUnitId = chargingUnitId.trim();
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(name)){
			name = name.trim();
			qpw.addQueryParam("name", name, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(economicType)){
			economicType = economicType.trim();
			qpw.addQueryParam("economicType", economicType, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(industrial)){
			industrial = industrial.trim();
			qpw.addQueryParam("industrial", industrial, QueryCondition.QC_EQ);
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
		list = userService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = userService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		
		if(list != null && list.size()>0){
			for(UserReturn userReturn : list){
				Map<String, Object> map=new HashMap<String, Object>();
				
				ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(userReturn.getChargingUnitId());
				UserWalletReturn userWalletReturn = userWalletService.getByUid(userReturn.getId());
				map.put("userId", userReturn.getId().toString());
				if (chargingUnit == null) {
					map.put("chargingUnit", null);
				}else{
					map.put("chargingUnit", chargingUnit.getName());
				}
				if (userWalletReturn == null) {
					map.put("userWallet", null);
				}else{
					map.put("userWallet", PriceTool.subZeroAndDot(Arith.div(String.valueOf(userWalletReturn.getCashAmount()), "10000", 4)));
				}
				mapList.add(map);
			}
		}
		
		return SUCCESS;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}


	public int getRecordCount() {
		return recordCount;
	}


	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getChargingUnitId() {
		return chargingUnitId;
	}


	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}


	public PageModel getPageModel() {
		return pageModel;
	}


	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public List<UserReturn> getList() {
		return list;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEconomicType() {
		return economicType;
	}

	public void setEconomicType(String economicType) {
		this.economicType = economicType;
	}

	public String getIndustrial() {
		return industrial;
	}

	public void setIndustrial(String industrial) {
		this.industrial = industrial;
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

	public List<Map<String, Object>> getMapList() {
		return mapList;
	}

	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}

	public void setUserWalletService(UserWalletService userWalletService) {
		this.userWalletService = userWalletService;
	}
	
}
