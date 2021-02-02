package com.able.circulardependecies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试循环依赖的问题
 * @param
 * @author jipeng
 * @date 2020-09-12 10:24
 */
public class MainClass {
	public static void main(String[] args){
		//IOC容器创建
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MainConfig.class);

		InstanceA instanceA= (InstanceA) ctx.getBean("instanceA");
		System.out.println("instanceA = " + instanceA);

		InstanceB instanceB= (InstanceB) ctx.getBean("instanceB");
		System.out.println("instanceB = " + instanceB);
//		Order order=new Order();
//		order.setId(1);
//		System.out.println("下单");
//		//发布事件
//		ctx.publishEvent(new OrderEvent(order,"减库存"));
//		System.out.println("日志");

	}
}

