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
@ComponentScan(basePackages = {"com.able.circulardependecies"})
@ImportResource(locations = {"beans.xml"})
public class MainConfig {
}

