package com.able.aop1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by xsls on 2019/6/10.
 */
@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy(
//		proxyTargetClass = true 强制使用cglib
)   /*<aop:aspectj-autoproxy/>*/
//(exposeProxy = true) //(proxyTargetClass = true)
@ComponentScan("com.able.aop1")
public class MainConfig {

	@Bean("tulingCalculate")
	public Calculate calculate() {
		return new TulingCalculate();
	}

	@Bean
	public TulingLogAspect tulingLogAspect() {
		return new TulingLogAspect();
	}


	@Bean
	public Calculate calculate2() {
		return new TulingCalculate();
	}
}
