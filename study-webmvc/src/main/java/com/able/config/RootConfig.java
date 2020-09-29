package com.able.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @param
 * @author jipeng
 * @date 2020-09-29 11:11
 */
/**
 * spring 容器不扫描controller
 *
 */

@ComponentScan(value = "com.able",excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})
@Configuration
public class RootConfig {
}

