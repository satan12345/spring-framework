package com.able.circulardependecies;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @param
 * @author jipeng
 * @date 2020-09-12 10:24
 */
@Configuration
@ComponentScan(
//		lazyInit = true,
		basePackages = {"com.able.circulardependecies","com.able.beanpostprocessor"})
//@ImportResource(locations = {"beans.xml"})
public class MainConfig {
}

