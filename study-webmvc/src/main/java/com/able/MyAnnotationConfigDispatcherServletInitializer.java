package com.able;

import com.able.config.AppConfig;
import com.able.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @param
 * @author jipeng
 * @date 2020-09-29 10:35
 */

/**
 * web容器启动的时候创建对象：调用方法初始化容器和前端控制器
 */
public class MyAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	//获取根容器的配置类(Spring的配合文件) 父容器
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	/**
	 * 获取web容器的配置类（springmvc配置文件） 子容器;
	 * @return
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{AppConfig.class};
	}

	/**
	 * 获取dispatcherServlet的映射信息
	 * / 拦截所有请求(包括静态资源 xx.js  xx.png) 但是不包括*.jsp
	 * /* 拦截所有请求: 连*.jsp页面都拦截
	 * @return
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}

