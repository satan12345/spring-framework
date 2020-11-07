package com.able.circulardependecies;

import org.springframework.context.ApplicationEvent;

/** 事件
 * @param
 * @author jipeng
 * @date 2020-11-04 14:45
 */
public class OrderEvent extends ApplicationEvent {
	private static final long serialVersionUID = -4794506524688746545L;

	private String name;
	public OrderEvent(Object source,String name) {
		super(source);
		this.name=name;
	}

	public String getName() {
		return name;
	}
}

