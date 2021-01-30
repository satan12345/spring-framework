package com.able.iocbeanlifecicle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 所有bean定义加载完成 但是还没有实例化bean的时候调用
 * @param
 * @author jipeng
 * @date 2021-01-29 19:37
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("ioc容器调用了 MyBeanFactoryPostProcessor ");
	}
}

