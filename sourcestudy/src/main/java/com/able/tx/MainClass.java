package com.able.tx;


import com.able.tx.service.PayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;

/**
 * @param
 * @author jipeng
 * @date 2020-11-11 15:44
 */
public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TxConfig.class);
		final Iterator<String> beanNamesIterator = ctx.getBeanFactory().getBeanNamesIterator();
		while (beanNamesIterator.hasNext()) {
			System.err.println("beanNamesIterator.next() = " + beanNamesIterator.next());
		}
		PayService payService = ctx.getBean(PayService.class);
		payService.pay(1, 100);
	}
}

