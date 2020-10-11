package com.able.iocbeanlifecicle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @param
 * @author jipeng
 * @date 2020-09-14 15:24
 */
public class MainStarter {
	public static void main(String[] args){
		//IOC容器创建
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MainConfig.class);
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Person person= (Person) ctx.getBean("person");
		System.out.println("person = " + person);
//		ctx.publishEvent(new ApplicationEvent("我手动发布了一个事件") {
//			private static final long serialVersionUID = 5461638641533674812L;
//		});

	}
}

