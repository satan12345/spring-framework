package com.able.iocbeanlifecicle;

import org.springframework.beans.factory.InitializingBean;

/**
 * @param
 * @author jipeng
 * @date 2020-09-14 15:22
 */
public class Person implements InitializingBean {
	private String name;
	private String sex;

	public void initPerson(){
		System.out.println("initPerson");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Person{");
		sb.append("name='").append(name).append('\'');
		sb.append(", sex='").append(sex).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("person afterPropertiesSet");
	}

}

