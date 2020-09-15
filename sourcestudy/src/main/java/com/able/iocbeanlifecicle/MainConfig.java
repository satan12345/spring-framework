package com.able.iocbeanlifecicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @param
 * @author jipeng
 * @date 2020-09-14 15:21
 */
@Configuration
@ComponentScan(basePackages = "com.able.iocbeanlifecicle")
public class MainConfig {

	@Bean(initMethod = "initPerson")
	public Person person() {
		Person person = new Person();
		person.setName("旗木卡卡西");
		person.setSex("男");
		return person;
	}
}

