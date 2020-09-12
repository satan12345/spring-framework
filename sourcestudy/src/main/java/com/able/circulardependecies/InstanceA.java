package com.able.circulardependecies;

/**
 * @param
 * @author jipeng
 * @date 2020-09-12 10:24
 */
public class InstanceA {
	private InstanceB instanceB;

	public InstanceB getInstanceB() {
		return instanceB;
	}

	public void setInstanceB(InstanceB instanceB) {
		this.instanceB = instanceB;
	}
}

