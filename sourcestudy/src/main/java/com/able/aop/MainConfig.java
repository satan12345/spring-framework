package com.able.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @param
 * @author jipeng
 * @date 2020-09-16 18:15
 */
@Configuration
/**
 * 这个注解利用导入 bean定义注册器（@Import(AspectJAutoProxyRegistrar.class) ImportBeanDefinitionRegistrar）
 * 		导入了组件:AnnotationAwareAspectJAutoProxyCreator
 */
//开启切面自动创建
@EnableAspectJAutoProxy(exposeProxy = true)
@Import(value = {MyImportBeanDefinitionRegistrar.class})

public class MainConfig {

	@Bean
	public Caculate caculate(){
		return new AbleCaculate();
	}
	@Bean
	public LogAspect logAspect(){
		return new LogAspect();
	}

}

