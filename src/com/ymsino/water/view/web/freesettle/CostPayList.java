package com.ymsino.water.view.web.freesettle;

import java.io.UnsupportedEncodingException;
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
import com.ymsino.water.service.archives.user.UserReturn;
import com.ymsino.water.service.archives.user.UserService;
import com.ymsino.water.service.freesettle.userWallet.UserWalletReturn;
import com.ymsino.water.service.freesettle.userWallet.UserWalletService;
import com.ymsino.water.service.freesettle.waterDayCost.QueryParam;
import com.ymsino.water.service.freesettle.waterDayCost.WaterDayCostReturn;
import com.ymsino.water.service.freesettle.waterDayCost.WaterDayCostService;
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
	private WaterDayCostService waterDayCostService;
    private PageModel pageModel = new PageModel();
    private int pageIndex;
	private int recordCount;
	private int pageSize;
	private String message = "";
    private List<WaterDayCostReturn> list = new ArrayList<WaterDayCostReturn>();
    private List<Map<String, Object>> mapList=new ArrayList<Map<String, Object>>();
    private String chargingUnitId;
    private String userId;
    private String payStatus = "1";//支付状态-1:未支付;1已支付
    private String checkPayStatus;//扣费检查状态-1:未检查;1已检查
    private String meterHardwareId;//无线智能水表ID
    private String concHardwareId;//集中器逻辑地址
    
	@SuppressWarnings("unused")
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
		if(!StringUtil.isEmpty(chargingUnitId)){
			chargingUnitId = chargingUnitId.trim();
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(userId)){
			userId = userId.trim();
			qpw.addQueryParam("userId", userId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(meterHardwareId)){
			meterHardwareId = meterHardwareId.trim();
			qpw.addQueryParam("meterHardwareId", meterHardwareId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(concHardwareId)){
			concHardwareId = concHardwareId.trim();
			qpw.addQueryParam("concHardwareId", concHardwareId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(payStatus)){
			qpw.addQueryParam("payStatus", Short.valueOf(payStatus), QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(checkPayStatus)){
			qpw.addQueryParam("checkPayStatus", Short.valueOf(checkPayStatus), QueryCondition.QC_EQ);
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = waterDayCostService.getListpager(qpm, pageModel.getStartRow(), pageModel.getPageSize());
		recordCount = waterDayCostService.getCount(qpm);
		pageModel.setRecordCount(recordCount);
		
		if(list != null && list.size()>0){
			for(WaterDayCostReturn waterDayCostReturn : list){
				Map<String, Object> map=new HashMap<String, Object>();
				UserReturn userReturn = userService.getByUserId(waterDayCostReturn.getUserId());
				ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(waterDayCostReturn.getChargingUnitId());
				UserWalletReturn userWalletReturn = userWalletService.getByUid(userReturn.getId());
				map.put("userId", waterDayCostReturn.getUserId());
				if (chargingUnit == null) {
					map.put("chargingUnit", null);
				}else{
					map.put("chargingUnit", chargingUnit.getName());
				}
				if(userReturn == null){
					map.put("userName", null);
					map.put("warnPrice", null);
				}else{
					map.put("userName", userReturn.getName());
					map.put("warnPrice", PriceTool.subZeroAndDot(Arith.div(String.valueOf(userReturn.getWarnPrice()), "10000", 4)));
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

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}

	public void setUserWalletService(UserWalletService userWalletService) {
		this.userWalletService = userWalletService;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getCheckPayStatus() {
		return checkPayStatus;
	}

	public void setCheckPayStatus(String checkPayStatus) {
		this.checkPayStatus = checkPayStatus;
	}

	public String getMeterHardwareId() {
		return meterHardwareId;
	}

	public void setMeterHardwareId(String meterHardwareId) {
		this.meterHardwareId = meterHardwareId;
	}

	public String getConcHardwareId() {
		return concHardwareId;
	}

	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public List<WaterDayCostReturn> getList() {
		return list;
	}

	public List<Map<String, Object>> getMapList() {
		return mapList;
	}

	public void setWaterDayCostService(WaterDayCostService waterDayCostService) {
		this.waterDayCostService = waterDayCostService;
	}

}
