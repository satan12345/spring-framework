package com.able.iocbeanlifecicle;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;


/**
 * @param
 * @author jipeng
 * @date 2020-12-29 17:38
 */
@Component
public class UserMapperFactoryBean implements FactoryBean<Object> {
	@Override
	public Object getObject() {
		UserMapper userMapper= (UserMapper) Proxy.newProxyInstance(UserMapperFactoryBean.class.getClassLoader(),
				new Class<?>[]{UserMapper.class}, (proxy, method, args) -> {
					System.out.println("方法"+method.getName()+"被调用了,参数为"+args.toString());
					return null;
				});
//		UserMapper userMapper=new UserMapper() {
//			@Override
//			public int selectOne(Integer id) {
//				return 0;
//			}
//		};
		return userMapper;

	}

	@Override
	public Class<?> getObjectType() {
		return UserMapper.class;
	}
}

