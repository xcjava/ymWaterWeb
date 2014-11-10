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
import com.ymsino.water.service.archives.waterCustomer.QueryParam;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerReturn;
import com.ymsino.water.service.archives.waterCustomer.WaterCustomerService;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class DownloadWaterCustomerList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private WaterCustomerService waterCustomerService;
	private ChargingUnitService chargingUnitService;
	private int recordCount;
    private List<WaterCustomerReturn> list = new ArrayList<WaterCustomerReturn>();
    private String userId = null;
    private String userName;
    private String startDate;
	private String endDate;
    private String chargingUnitId = null;
    private String customerId;
    private String customerStatus;
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
		if(!StringUtil.isEmpty(customerId)){
			qpw.addQueryParam("customerId", customerId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(customerStatus)){
			qpw.addQueryParam("customerStatus", customerStatus, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(chargingUnitId)){
			chargingUnitId = chargingUnitId.trim();
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(userName)){
			userName = userName.trim();
			qpw.addQueryParam("userName", userName, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(startDate) && !StringUtil.isEmpty(endDate)){
			if(DateUtil.parseDate(startDate, "yyyy-MM-dd").getTime() > DateUtil.parseDate(endDate , "yyyy-MM-dd").getTime()){
				Date date1 = DateUtil.parseDate(startDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
				Date date2 = DateUtil.parseDate(endDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
				qpw.addQueryParams(new String[]{"openTimestamp","openTimestamp"},  new Object[]{date2.getTime(),date1.getTime()} , new QueryCondition[]{QueryCondition.QC_GE,QueryCondition.QC_LE},new QueryLink[]{QueryLink.QL_AND});
			}else{
				Date date1 = DateUtil.parseDate(startDate + " 00:00:00","yyyy-MM-dd HH:mm:ss");
				Date date2 = DateUtil.parseDate(endDate + " 23:59:59","yyyy-MM-dd HH:mm:ss");
				qpw.addQueryParams(new String[]{"openTimestamp","openTimestamp"},  new Object[]{date1.getTime(),date2.getTime()} , new QueryCondition[]{QueryCondition.QC_GE,QueryCondition.QC_LE},new QueryLink[]{QueryLink.QL_AND});
			}
		}
		
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = waterCustomerService.getListpager(qpm, 0, Integer.MAX_VALUE);
		recordCount = waterCustomerService.getCount(qpm);
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			WaterCustomerReturn wc = list.get(i);
			if(wc == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(wc.getChargingUnitId());
			
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("用水用户编号", StringUtil.isEmpty(wc.getCustomerId()) ? "" : wc.getCustomerId());
			String ctStatus = "";
			if(!StringUtil.isEmpty(wc.getCustomerStatus())){
				if("1".equals(wc.getCustomerStatus())){
					ctStatus = "正常用水客户";
				}else if("2".equals(wc.getCustomerStatus())){
					ctStatus = "当前新装客户";
				}else if("3".equals(wc.getCustomerStatus())){
					ctStatus = "当前变更客户";
				}else if("4".equals(wc.getCustomerStatus())){
					ctStatus = "已销户客户";
				}
			}
			map.put("用户状态", ctStatus);
			map.put("客户编号", StringUtil.isEmpty(wc.getUserId()) ? "" : wc.getUserId());
			map.put("客户姓名", StringUtil.isEmpty(wc.getUserName()) ? "" : wc.getUserName());
			map.put("开始时间", wc.getOpenTimestamp() == null ? "" : DateUtil.format(new Date(wc.getOpenTimestamp()), "yyyy-MM-dd HH:mm:ss"));
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("用水性质", StringUtil.isEmpty(wc.getWaterNature()) ? "" : wc.getWaterNature());
			map.put("创建时间", DateUtil.format(new Date(wc.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
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
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}
	public List<WaterCustomerReturn> getList() {
		return list;
	}
	public void setList(List<WaterCustomerReturn> list) {
		this.list = list;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	public void setWaterCustomerService(WaterCustomerService waterCustomerService) {
		this.waterCustomerService = waterCustomerService;
	}

}
