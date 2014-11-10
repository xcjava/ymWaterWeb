package com.ymsino.water.view.web.archives;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.date.DateUtil;
import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryLink;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.gmail.xcjava.base.io.FilesTool;
import com.gmail.xcjava.base.io.PropertyReader;
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

public class DownloadUserList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
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
	private int recordCount;
	private String message = "";
    private List<UserReturn> list = new ArrayList<UserReturn>();
	@Override
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("sessionUnitId");
		
		String exportCount = PropertyReader.getProperties("config.properties").getProperty("exportCount");
		
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
		list = userService.getListpager(qpm, 0, Integer.MAX_VALUE);
		recordCount = userService.getCount(qpm);
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			UserReturn user = list.get(i);
			if(user == null) continue;
			UserWalletReturn userWalletReturn = userWalletService.getByUid(user.getId());
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(user.getChargingUnitId());
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("客户ID", user.getId() == null ? "" : user.getId().toString());
			map.put("客户编号", StringUtil.isEmpty(user.getUserId()) ? "" : user.getUserId());
			map.put("客户姓名", StringUtil.isEmpty(user.getName()) ? "" : user.getName());
			map.put("余额(元)", userWalletReturn == null ? "" : Arith.div(String.valueOf(userWalletReturn.getCashAmount()), "10000", 4));
			map.put("产业分类", StringUtil.isEmpty(user.getIndustrial()) ? "" : user.getIndustrial());
			map.put("经济类型", StringUtil.isEmpty(user.getEconomicType()) ? "" : user.getEconomicType());
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("创建时间", DateUtil.format(new Date(user.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
			linkedHashMap.put(String.valueOf(i), map);
		}
		try {
			response.addHeader("Content-Disposition", "attachment;filename=\"" + "report.xls" + "\"");
			FilesTool.writeToExcel(linkedHashMap, null, response);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getChargingUnitId() {
		return chargingUnitId;
	}
	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<UserReturn> getList() {
		return list;
	}
	public void setList(List<UserReturn> list) {
		this.list = list;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}
	public void setUserWalletService(UserWalletService userWalletService) {
		this.userWalletService = userWalletService;
	}

}
