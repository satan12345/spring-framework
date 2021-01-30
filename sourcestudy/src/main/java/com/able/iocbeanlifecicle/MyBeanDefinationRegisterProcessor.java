package com.able.iocbeanlifecicle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 *用于添加bean定义
 * @param
 * @author jipeng
 * @date 2021-01-29 19:40
 */
@Component
public class MyBeanDefinationRegisterProcessor implements BeanDefinitionRegistryPostProcessor {
	/**
	 *
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.err.println("MyBeanDefinationRegisterProcessor postProcessBeanDefinitionRegistry");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.err.println("MyBeanDefinationRegisterProcessor postProcessBeanFactory");
	}
}

