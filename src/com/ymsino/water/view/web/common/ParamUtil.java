/**
 * HttpServletRequest对象获取工具
 * @author 洪晓聪 xcjava@gmail.com
 * @version 1.3
 */
package com.ymsino.water.view.web.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class ParamUtil {

	public ParamUtil() {
	}

	public static String getString(HttpServletRequest request, String paramName) {
		String temp = request.getParameter(paramName);
		if (temp != null && !temp.equals("")) {
			return temp;
		} else {
			return null;
		}
	}

	public static String getString(HttpServletRequest request,
			String paramName, String defaultString) {
		String temp = getString(request, paramName);
		if (temp == null) {
			temp = defaultString;
		}
		return temp;
	}

	public static int getInt(HttpServletRequest request, String paramName)
			throws NumberFormatException {
		return Integer.parseInt(getString(request, paramName));
	}

	public static int getInt(HttpServletRequest request, String paramName,
			int defaultInt) {
		try {
			String temp = getString(request, paramName);
			if (temp == null) {
				return defaultInt;
			} else {
				return Integer.parseInt(temp);
			}
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		return 0;
	}
	
	public static Short getShort(HttpServletRequest request, String paramName)
			throws NumberFormatException {
		return Short.parseShort(getString(request, paramName));
	}
	
	public static Short getShort(HttpServletRequest request, String paramName,
			Short defaultShort) {
		try {
			String temp = getString(request, paramName);
			if (temp == null) {
				return defaultShort;
			} else {
				return Short.parseShort(temp);
			}
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		return 0;
	}

	public static long getLong(HttpServletRequest request, String paramName)
			throws NumberFormatException {
		return Long.parseLong(getString(request, paramName));
	}

	public static long getLong(HttpServletRequest request, String paramName,
			long defaultLng) {
		try {
			String temp = getString(request, paramName);
			if (temp == null) {
				return defaultLng;
			} else {
				return Long.parseLong(temp);
			}
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		return 0;
	}
	
	public static Object getSession(HttpServletRequest request,String name,String reback)
	{
		Object temp = request.getSession().getAttribute(name);
		if(temp == null)
			return reback;
		else
			return temp;
	}
	
	public static String getCookie(HttpServletRequest request,String strName,String reback)
	{
		Cookie[] cookies = request.getCookies();
		if(cookies!=null)
		{
			for(int i=0;i<cookies.length;i++)
			{
				Cookie cookie = cookies[i];
				if(cookie.getName().equalsIgnoreCase(strName))
					return cookie.getValue();
			}
		}
		return reback;
	}

}
