package com.ymsino.water.view.web.data;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gmail.xcjava.base.date.DateUtil;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.comm.readData.MeterDataVo;
import com.ymsino.water.service.comm.readData.ReadDataService;

public class ReadDataByDate extends ActionSupport {

	private static final long serialVersionUID = 6970850564906342550L;
	private ReadDataService readDataService;
    private List<MeterDataVo> list = new ArrayList<MeterDataVo>();
	private String dataStr;//日期
	private String wmSn;//水表编号
	private String concHardwareId;//集中器编号
	private String count;
	private String message = "";
    
	public String execute() throws Exception{
		try {
			if(StringUtil.isEmpty(concHardwareId)){
				message = "集中器编号不能为空！";
				return "check";
			}
			if(StringUtil.isEmpty(dataStr)){
				message = "日期不能为空！";
				return "check";
			}
			if(StringUtil.isEmpty(wmSn)){
				message = "开始水表编号wmSn不能为空！";
				return "check";
			}
			if(StringUtil.isEmpty(count)){
				message = "连续数量不能为空！";
				return "check";
			}
			Date date = DateUtil.parseDate(dataStr, "yyyyMMdd");
			String stringdate = DateUtil.formatDate(date, "yyyyMMdd");
			
			list = readDataService.readDataByDate(concHardwareId, Integer.valueOf(wmSn),Integer.valueOf(count), stringdate);
		} catch (Exception e) {
			e.printStackTrace();
			message = e.getMessage();
			return "check";
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

	public String getConcHardwareId() {
		return concHardwareId;
	}

	public void setConcHardwareId(String concHardwareId) {
		this.concHardwareId = concHardwareId;
	}

	public List<MeterDataVo> getList() {
		return list;
	}

	public void setReadDataService(ReadDataService readDataService) {
		this.readDataService = readDataService;
	}

	public void setDataStr(String dataStr) {
		this.dataStr = dataStr;
	}

	public void setWmSn(String wmSn) {
		this.wmSn = wmSn;
	}

	public void setCount(String count) {
		this.count = count;
	}
	
}
