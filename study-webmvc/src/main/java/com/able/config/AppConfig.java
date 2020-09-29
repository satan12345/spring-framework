package com.able.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @param
 * @author jipeng
 * @date 2020-09-29 11:12
 */
// useDefaultFilters= false 禁用默认的过滤规则： 默认的过滤规则是扫描所有的
@ComponentScan(value = "com.able",includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
},
		useDefaultFilters = false
)
@Configuration
public class AppConfig {
}

