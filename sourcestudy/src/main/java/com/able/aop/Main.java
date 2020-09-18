package com.able.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @param
 * @author jipeng
 * @date 2020-09-16 18:15
 */
public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Caculate caculate = (Caculate) annotationConfigApplicationContext.getBean("caculate");
		caculate.div(6, 2);
//		((Caculate) AopContext.currentProxy()).div(4,2);
//		caculate.div(4, 2);
//		Cat bean = annotationConfigApplicationContext.getBean(Cat.class);
//
//		System.out.println(bean);
	}
}

