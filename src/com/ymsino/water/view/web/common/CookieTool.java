package com.ymsino.water.view.web.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieTool {

	private CookieTool(){}
	
	/**
	 * 保存或修改cookie
	 * @param request	http请求
	 * @param response	http响应
	 * @param name		cookie名称	
	 * @param value		cookie值
	 * @param seconds	cookie保存秒数,若为-1则保存至浏览器关闭
	 */
	public static void saveOrUpdateCookie(HttpServletRequest request, HttpServletResponse response, String name,String value, int seconds){
		String serverName = request.getServerName();
        String cookieDomain = serverName.substring(serverName.indexOf('.'), serverName.length());
		boolean isSave = true;
		Cookie[] cookies = request.getCookies();
		if(cookies != null && cookies.length > 0){
			for(Cookie c : cookies){
				if(c.getName().equals(name)){
					c.setValue(value);
					c.setMaxAge(seconds);
					c.setDomain(cookieDomain);
					c.setPath("/");
					response.addCookie(c);
					isSave = false;
				}
			}
		}
		
		if(isSave){
			Cookie cookie = new Cookie(name, value);
			cookie.setDomain(cookieDomain);
			cookie.setMaxAge(seconds);
			cookie.setPath("/");
			response.addCookie(cookie);
		}
	}
	
	/**
	 * 删除cookie
	 * @param response	http响应
	 * @param name		cookie名称	
	 */
	public static void removeCookie(HttpServletResponse response, String name){
		
		Cookie cookie = new Cookie(name, null); 
		cookie.setMaxAge(0);
		response.addCookie(cookie); 
		
	}

	
	public static Cookie getCookie(HttpServletRequest request,String name){

		Cookie[] cookies = request.getCookies();
		if(cookies != null && cookies.length > 0){
			for(Cookie c : cookies){
				if(c.getName().equals(name)){
					return c;
				}
			}
		}
		return null;
	}
	
}
