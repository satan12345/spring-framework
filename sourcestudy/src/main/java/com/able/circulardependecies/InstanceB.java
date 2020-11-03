package com.able.circulardependecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @param
 * @author jipeng
 * @date 2020-09-12 10:24
 */
@Component
public class InstanceB {
	@Autowired
	private InstanceA instanceA;

	public InstanceA getInstanceA() {
		return instanceA;
	}

	public void setInstanceA(InstanceA instanceA) {
		this.instanceA = instanceA;
	}
}

