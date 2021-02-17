package com.able.iocbeanlifecicle;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @param
 * @author jipeng
 * @date 2021-02-17 20:15
 */
@Component
public class MyTestFactoryBean implements FactoryBean<C> {
	@Override
	public C getObject() throws Exception {
		return new C();
	}

	@Override
	public Class<?> getObjectType() {
		return C.class;
	}
}

