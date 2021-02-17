package com.able.iocbeanlifecicle;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @param
 * @author jipeng
 * @date 2020-09-14 15:24
 */
public class MainStarter {
	public static void main(String[] args) {

		//IOC容器创建
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
//
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//		final Person person = (Person) ctx.getBean("person");
//		System.out.println("person = " + person);
//		ctx.publishEvent(new ApplicationEvent("我手动发布了一个事件") {
//			private static final long serialVersionUID = 5461638641533674812L;
//		});
//		BeanDefinition beanDefinition = ctx.getBeanDefinition("person");
//		final String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//		for (int i = 0; i < beanDefinitionNames.length; i++) {
//			System.out.println("beanDefinitionNames[i] = " + beanDefinitionNames[i]);
//		}
//		System.out.println("beanDefinition.getBeanClass().getName() = " + beanDefinition.getBeanClassName());
//
//		UserMapper userMapper = (UserMapper) ctx.getBean("userMapperFactoryBean");
//		final int i = userMapper.selectOne(1);
//		System.err.println(i);
		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.err.println(beanDefinitionName);
		}
		C c = (C) ctx.getBean("myTestFactoryBean");
		System.out.println("c = " + c);

	}
}

