package com.able.inversionofcontrol;

/**
 * @param
 * @author jipeng
 * @date 2020-09-14 14:12
 */
public class HandSomeBoy {

	private BeautifulGirl beautifulGirl;

	public HandSomeBoy() {
		//this.beautifulGirl = beautifulGirl;
	}

	public BeautifulGirl getBeautifulGirl() {
		return beautifulGirl;
	}

	public void setBeautifulGirl(BeautifulGirl beautifulGirl) {
		this.beautifulGirl = beautifulGirl;
	}

	public void doSomething(){
		beautifulGirl.doSomthing();
	}
}

