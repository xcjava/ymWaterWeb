package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.waterMeter.QueryParam;
import com.ymsino.water.service.archives.waterMeter.WaterMeterReturn;
import com.ymsino.water.service.archives.waterMeter.WaterMeterSaveParam;
import com.ymsino.water.service.archives.waterMeter.WaterMeterService;
import com.ymsino.water.view.web.common.Arith;
import com.ymsino.water.view.web.common.PriceTool;

public class SaveWaterMeter extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private String hardwareId;
	private String message;
	private WaterMeterService waterMeterService;
	private WaterMeterSaveParam waterMeter;
	private String curr;
	private String type;
	private String priceStr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(hardwareId)){
				message = "水表编号不能为空！";
				return SUCCESS;
			}
			if(StringUtil.isEmpty(waterMeter.getWaterCustomerId())){
				message = "用水用户编号不能为空！";
				return SUCCESS;
			}
			if(StringUtil.isEmpty(type)){
				message = "用水类型不能为空！";
				return SUCCESS;
			}
			//一个用水用户只能对应一个同类型水表
			QueryParamWriter qpw = new QueryParamWriter();
			qpw.addQueryParam("waterCustomerId", waterMeter.getWaterCustomerId(), QueryCondition.QC_EQ);
			qpw.addQueryParam("type", Short.valueOf(type), QueryCondition.QC_EQ);
			QueryParam qpm = new QueryParam();
			qpm.setQueryCon(qpw.getQueryCon());
			qpm.setQueryLink(qpw.getQueryLink());
			qpm.setQueryValue(qpw.getQueryValue());
			List<WaterMeterReturn> wmr = waterMeterService.getListpager(qpm,0, Integer.MAX_VALUE);
			if(wmr != null && wmr.size() > 0){
				message = "该用水用户已经创建过此类型的水表，请选择其他用水用户！";
				return SUCCESS;
			}
			if(!StringUtil.isEmpty(priceStr)){
				waterMeter.setPrice(Long.valueOf(PriceTool.subZeroAndDot(Arith.mul(priceStr.trim(),"10000"))));
			}
			waterMeter.setHardwareId(hardwareId);
			waterMeter.setType(Short.valueOf(type));
			waterMeterService.save(waterMeter);
			message = "添加成功！";
		} catch (Exception e) {
			message = e.getMessage();
			e.printStackTrace();
		}
		return SUCCESS;
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

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public WaterMeterSaveParam getWaterMeter() {
		return waterMeter;
	}

	public void setWaterMeter(WaterMeterSaveParam waterMeter) {
		this.waterMeter = waterMeter;
	}

	public void setWaterMeterService(WaterMeterService waterMeterService) {
		this.waterMeterService = waterMeterService;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPriceStr() {
		return priceStr;
	}

	public void setPriceStr(String priceStr) {
		this.priceStr = priceStr;
	}

}
