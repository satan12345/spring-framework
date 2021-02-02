package com.able.circulardependecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @param
 * @author jipeng
 * @date 2020-09-12 10:24
 */
@Component
public class InstanceA  {
	private String msg;
	@Autowired
	private InstanceB instanceB;

	public void setInstanceB(InstanceB instanceB) {
		this.instanceB = instanceB;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("InstanceA{");
		sb.append("msg='").append(msg).append('\'');
		sb.append(", instanceB=").append(instanceB);
		sb.append('}');
		return sb.toString();
	}
}

