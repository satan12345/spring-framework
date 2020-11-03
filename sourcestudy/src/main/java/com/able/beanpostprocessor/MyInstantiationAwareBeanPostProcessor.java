package com.able.beanpostprocessor;

import com.able.circulardependecies.InstanceA;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/** 第一个beanPostProcessor
 * @param
 * @author jipeng
 * @date 2020-10-17 17:54
 */
//@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equalsIgnoreCase("InstanceA")) {
			 InstanceA instanceA = new InstanceA();
//			 instanceA.setMsg("MyInstantiationAwareBeanPostProcessor");
			return instanceA;
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return false;
	}
}

