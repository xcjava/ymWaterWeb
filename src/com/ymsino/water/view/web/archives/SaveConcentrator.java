package com.ymsino.water.view.web.archives;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.concentrator.ConcentratorSaveParam;
import com.ymsino.water.service.archives.concentrator.ConcentratorService;

public class SaveConcentrator extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private String message;
	private ConcentratorService concentratorService;
	private ConcentratorSaveParam concentrator;
	private String curr;
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtils.isEmpty(concentrator.getLogicCode()) ||
					StringUtils.isEmpty(concentrator.getAreaCode())){
				message = "缺少必要属性";
				return "editError";
			}
			
			String regex_area = "[0-9]{4}";
			String regex_logic = "[0-9]{1,4}";
			if(!this.isRegexValidate(concentrator.getAreaCode(), regex_area)){
				message = "区域码格式不正确";
				return "editError";
			}
			
			if(!this.isRegexValidate(concentrator.getLogicCode(), regex_logic)){
				message = "逻辑地址格式不正确";
				return "editError";
			}
			
			String logicCode = concentrator.getLogicCode();
			int length = logicCode.length();
			for(int i = 0; i < 4 - length; i++){
				logicCode = "0" + logicCode;
			}
			String hardwareId = logicCode + concentrator.getAreaCode().substring(2, 4) + concentrator.getAreaCode().substring(0, 2);
			if(concentratorService.getById(hardwareId) != null){
				message = "集中器编号已存在！";
				return "editError";
			}
			boolean flag = concentratorService.save(concentrator);
			if(flag)
				message = "添加成功！";
			else
				message = "添加失败！";
		} catch (Exception e) {
			message = e.getMessage();
			return "editError";
		}
		return SUCCESS;
	}
	
	public boolean isRegexValidate(String source, String regexp){
		Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(source);
        return m.matches();
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

	public ConcentratorSaveParam getConcentrator() {
		return concentrator;
	}

	public void setConcentrator(ConcentratorSaveParam concentrator) {
		this.concentrator = concentrator;
	}

	public void setConcentratorService(ConcentratorService concentratorService) {
		this.concentratorService = concentratorService;
	}

}
