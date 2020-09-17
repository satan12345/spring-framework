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
//		Caculate caculate = (Caculate) annotationConfigApplicationContext.getBean("caculate");
//		caculate.add(1,2);
		Cat bean = annotationConfigApplicationContext.getBean(Cat.class);
		System.out.println(bean);
	}
}

