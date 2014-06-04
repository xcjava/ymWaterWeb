package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.gmail.xcjava.base.date.DateUtil;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateModifyParam;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateReturn;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateService;

public class UpdatePriceTemplate extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private String id;
	private String name;
	private String type;
	private Float level1Num;//1阶最大值
	private Long level1Cost;//1阶价格，单位毫
	private Float level2Num;//1阶最大值
	private Long level2Cost;//1阶价格，单位毫
	private Float level3Num;//1阶最大值
	private Long level3Cost;//1阶价格，单位毫
	private Float level4Num;//1阶最大值
	private Long level4Cost;//1阶价格，单位毫
	private String billingPeriod;//结算周期
	private String startDate;//开始日期
	private String endDate;//结束日期
	private String chargingUnitId;
	private PriceTemplateService priceTemplateService;
	private String message;
	
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(id)){
				message = "价目id不能为空！";
				return SUCCESS;
			}
			PriceTemplateReturn priceTemplateReturn = priceTemplateService.getById(Long.valueOf(id));
			if(priceTemplateReturn == null){
				message = "价目不存在！";
				return SUCCESS;
			}
			PriceTemplateModifyParam priceTemplateModifyParam = new PriceTemplateModifyParam();
			priceTemplateModifyParam.setId(Long.valueOf(id));
			priceTemplateModifyParam.setName(name);
			priceTemplateModifyParam.setType(type);
			priceTemplateModifyParam.setLevel1Num(level1Num);
			priceTemplateModifyParam.setLevel1Cost(level1Cost);
			priceTemplateModifyParam.setLevel2Num(level2Num);
			priceTemplateModifyParam.setLevel2Cost(level2Cost);
			priceTemplateModifyParam.setLevel3Num(level3Num);
			priceTemplateModifyParam.setLevel3Cost(level3Cost);
			priceTemplateModifyParam.setLevel4Num(level4Num);
			priceTemplateModifyParam.setLevel4Cost(level4Cost);
			priceTemplateModifyParam.setBillingPeriod(billingPeriod);
			if(!StringUtil.isEmpty(startDate)){
				priceTemplateModifyParam.setStartTimestamp(DateUtil.parseDate(startDate, "yyyy-MM-dd").getTime());
			}
			if(!StringUtil.isEmpty(endDate)){
				priceTemplateModifyParam.setEndTimestamp(DateUtil.parseDate(endDate, "yyyy-MM-dd").getTime());
			}
//			priceTemplateModifyParam.setChargingUnitId(chargingUnitId);//价目模板的收费单位不允许修改
			priceTemplateService.modify(priceTemplateModifyParam);
			message = "修改成功！";
		} catch (Exception e) {
			e.printStackTrace();
			message = e.getMessage();
		}
		return SUCCESS;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		if(!StringUtil.isEmpty(message)){
			try {
				message = URLEncoder.encode(message, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				message = "";
			}
		}
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getLevel1Num() {
		return level1Num;
	}

	public void setLevel1Num(Float level1Num) {
		this.level1Num = level1Num;
	}

	public Long getLevel1Cost() {
		return level1Cost;
	}

	public void setLevel1Cost(Long level1Cost) {
		this.level1Cost = level1Cost;
	}

	public Float getLevel2Num() {
		return level2Num;
	}

	public void setLevel2Num(Float level2Num) {
		this.level2Num = level2Num;
	}

	public Long getLevel2Cost() {
		return level2Cost;
	}

	public void setLevel2Cost(Long level2Cost) {
		this.level2Cost = level2Cost;
	}

	public Float getLevel3Num() {
		return level3Num;
	}

	public void setLevel3Num(Float level3Num) {
		this.level3Num = level3Num;
	}

	public Long getLevel3Cost() {
		return level3Cost;
	}

	public void setLevel3Cost(Long level3Cost) {
		this.level3Cost = level3Cost;
	}

	public Float getLevel4Num() {
		return level4Num;
	}

	public void setLevel4Num(Float level4Num) {
		this.level4Num = level4Num;
	}

	public Long getLevel4Cost() {
		return level4Cost;
	}

	public void setLevel4Cost(Long level4Cost) {
		this.level4Cost = level4Cost;
	}

	public String getBillingPeriod() {
		return billingPeriod;
	}

	public void setBillingPeriod(String billingPeriod) {
		this.billingPeriod = billingPeriod;
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

	public void setPriceTemplateService(PriceTemplateService priceTemplateService) {
		this.priceTemplateService = priceTemplateService;
	}
	
}
