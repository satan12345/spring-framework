package com.able.circulardependecies;

import org.springframework.stereotype.Component;

/**
 * @param
 * @author jipeng
 * @date 2020-09-12 10:24
 */
@Component
public class InstanceB {
	private InstanceA instanceA;

	public InstanceA getInstanceA() {
		return instanceA;
	}

	public void setInstanceA(InstanceA instanceA) {
		this.instanceA = instanceA;
	}
}

