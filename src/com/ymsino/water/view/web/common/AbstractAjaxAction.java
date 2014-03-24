package com.ymsino.water.view.web.common;

import com.ymsino.water.sys.exception.AjaxActionException;

public abstract class AbstractAjaxAction {

	/**
	 * 回调函数
	 */
	private String callbackName;
	
	/**
	 * 输出值
	 */
	private String result;
	/**
	 * 获取方式
	 * json:直接返回json,默认
	 * callback:jsonp函数回调
	 * check:jsonp变量检查
	 */
	private String method = "json";
	/**
	 * javascript模块名
	 */
	private String jsPageage;
	/**
	 * 对象名
	 */
	private String object;
	
	
	public String getCallbackName() {
		return callbackName;
	}
	public void setCallbackName(String callbackName) {
		this.callbackName = callbackName;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	public String getResult() {
		return result;
	}
	
	public String getJsPageage() {
		return jsPageage;
	}

	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	
	public String execute() throws AjaxActionException
	{
		if(!this.method.equals("json") && !this.method.equals("callback") && !this.method.equals("check"))
			throw new AjaxActionException("非法获取方式");
		
		if(this.method.equals("callback") && (this.callbackName == null || this.callbackName.equals("")))
			throw new AjaxActionException("非法回调函数");
		
		if(this.method.equals("check") && (this.object == null || this.object.equals("")))
			throw new AjaxActionException("非法回调函数");
		
		this.jsPageage = setPageage();
		if(this.jsPageage == null || this.jsPageage.equals(""))
			throw new AjaxActionException("非法模块名");
		
		try {
			this.result = setResult();
		} catch (Exception e) {
			this.result = "结果获取发生异常";
			e.printStackTrace();
		}

		return this.method;
	}
	
	/**
	 * 设置返回的json字符串
	 * @return
	 */
	protected abstract String setResult()  throws Exception ;
	/**
	 * 设置js模块名
	 * @return
	 */
	protected abstract String setPageage();
}
