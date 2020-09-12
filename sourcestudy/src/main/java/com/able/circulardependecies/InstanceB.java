package com.able.circulardependecies;

/**
 * @param
 * @author jipeng
 * @date 2020-09-12 10:24
 */
public class InstanceB {
	private InstanceA instanceA;

	public InstanceA getInstanceA() {
		return instanceA;
	}

	public void setInstanceA(InstanceA instanceA) {
		this.instanceA = instanceA;
	}
}

