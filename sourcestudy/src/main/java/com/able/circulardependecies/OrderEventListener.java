package com.able.circulardependecies;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/** 监听器
 * @param
 * @author jipeng
 * @date 2020-11-04 14:48
 */
@Component
@Lazy
public class OrderEventListener implements ApplicationListener<OrderEvent> {
	@Override
	public void onApplicationEvent(OrderEvent event) {
		if (event.getName().equalsIgnoreCase("减库存")) {
			System.out.println("减库存..............");
		}
	}
}

