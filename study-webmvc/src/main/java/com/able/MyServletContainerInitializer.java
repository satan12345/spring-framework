package com.able;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @param
 * @author jipeng
 * @date 2020-09-22 18:33
 */
public class MyServletContainerInitializer implements ServletContainerInitializer {

	/**
	 * 应用启动的时候会运行onStartup方法
	 * @param c
	 * @param ctx 代表当前web应用的ServletContext ：应用的上下文对象
	 * @throws ServletException
	 */
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {

	}
}

