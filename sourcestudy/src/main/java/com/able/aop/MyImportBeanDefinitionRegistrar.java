package com.able.aop;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @param
 * @author jipeng
 * @date 2020-09-17 11:58
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(Cat.class);
		MutablePropertyValues propertyValues=new MutablePropertyValues();
		propertyValues.add("name","旗木卡卡西");
		rootBeanDefinition.setPropertyValues(propertyValues);

		registry.registerBeanDefinition("cat",rootBeanDefinition);

	}
}

