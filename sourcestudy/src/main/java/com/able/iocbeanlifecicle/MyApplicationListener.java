package com.able.iocbeanlifecicle;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @param
 * @author jipeng
 * @date 2020-10-04 22:08
 */
@Component
public class MyApplicationListener  implements ApplicationListener<ApplicationEvent> {


	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.err.println("MyApplicationListener 接收到一个事件"+event);
	}
}

