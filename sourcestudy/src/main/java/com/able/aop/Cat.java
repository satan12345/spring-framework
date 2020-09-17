package com.able.aop;

/**
 * @param
 * @author jipeng
 * @date 2020-09-17 11:48
 */
public class Cat {

	private String name;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Cat{");
		sb.append("name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

