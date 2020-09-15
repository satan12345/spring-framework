package com.able.iocbeanlifecicle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @param
 * @author jipeng
 * @date 2020-09-15 10:31
 */
@Component
public class PersonPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Person) {
			Person person= (Person) bean;
			person.setName("宇智波鼬");
			System.out.println("PersonPostProcessor postProcessBeforeInitialization");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Person) {
			Person person= (Person) bean;
			person.setName("宇智波鼬11");
			System.out.println("PersonPostProcessor postProcessAfterInitialization");
		}
		return bean;

	}
}

