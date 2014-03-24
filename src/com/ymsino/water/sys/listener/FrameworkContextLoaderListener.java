package com.ymsino.water.sys.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class FrameworkContextLoaderListener extends ContextLoaderListener
		implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
		
		System.out.println("----------初始化系统超级管理员----------");
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {

	}

}
