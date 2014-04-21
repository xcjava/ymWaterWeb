package com.ymsino.water.sys.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ymsino.water.service.manager.manager.ManagerReturn;
import com.ymsino.water.service.manager.manager.ManagerSaveParam;
import com.ymsino.water.service.manager.manager.ManagerService;

public class FrameworkContextLoaderListener extends ContextLoaderListener
		implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
		
		System.out.println("----------初始化系统超级管理员----------");
		ManagerService managerService = (ManagerService) context.getBean("managerService");
		ManagerReturn manager = managerService.login("administrator", "123456");
		if(manager == null){
			ManagerSaveParam managerSaveParam = new ManagerSaveParam();
			managerSaveParam.setName("超级管理员");
			managerSaveParam.setManagerId("administrator");
			managerSaveParam.setPassword("123456");
			managerService.save(managerSaveParam);
			managerService.openStatus("administrator");
		}
		System.out.println("----------初始化系统超级管理员结束----------");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {

	}

}
