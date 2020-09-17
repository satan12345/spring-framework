package com.able.aop;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @param
 * @author jipeng
 * @date 2020-09-17 11:39
 */
@Component
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// 返回要导入组件的全类名
		return new String[]{Cat.class.getName()};
	}
}

