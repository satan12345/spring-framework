package com.able.circulardependecies;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @param
 * @author jipeng
 * @date 2020-11-04 15:09
 */
@Component
public class MyContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent>
{
	//基于注解的
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (event.getApplicationContext().getParent()==null) {
			System.out.println("容器加载完成");
		}

	}
}

