package com.able;

import com.able.servlet3.HelloFilter;
import com.able.servlet3.HelloListener;
import com.able.servlet3.HelloServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/**
 * @param
 * @author jipeng
 * @date 2020-09-22 18:33
 * servlet容器启动的时候 会查找META-INF/service目录下的
 * javax.servlet.ServletContainerInitializer这个文件 读取其中的实现类
 * 然后调用onStartup方法
 *
 */
@HandlesTypes(value = {Tuling.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

	/**
	 * 应用启动的时候会运行onStartup方法
	 * @param c 这个集合是@HandlesTypes(value = {Tuling.class}) 这个注解所指定
	 *          的接口的所有的实现类
	 * @param servletContext 代表当前web应用的ServletContext ：应用的上下文对象
	 * @throws
	 */
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext servletContext) throws ServletException {
		List<Tuling> tulingList=new ArrayList<>();
		if (c!=null) {
			for (Class<?> aClass : c) {
				if (!aClass.isInterface()&&!Modifier.isAbstract(aClass.getModifiers())
						&& Tuling.class.isAssignableFrom(aClass)) {
					try {
						tulingList.add((Tuling) aClass.newInstance());
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
			for (Tuling tuling : tulingList) {
				tuling.sayHello();
			}

		}
		//注册listener
		servletContext.addListener(HelloListener.class);
		//注册servlet
		ServletRegistration.Dynamic helloServlet =
				servletContext.addServlet("helloServlet", new HelloServlet());
		helloServlet.addMapping("/helloServlet");
		//注册filter
		FilterRegistration.Dynamic helloFilter = servletContext.addFilter("helloFilter", HelloFilter.class);
		helloFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");


	}
}

