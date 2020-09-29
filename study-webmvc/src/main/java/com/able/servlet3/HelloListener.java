package com.able.servlet3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @param
 * @author jipeng
 * @date 2020-09-22 18:16
 */
@WebListener
public class HelloListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("HelloListener.contextInitialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("HelloListener.contextDestroyed");

	}
}

