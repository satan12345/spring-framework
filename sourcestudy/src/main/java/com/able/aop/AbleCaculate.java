package com.able.aop;

/**
 * @param
 * @author jipeng
 * @date 2020-09-16 18:57
 */
public class AbleCaculate implements Caculate {

	@Override
	public int add(int numA,int numB){
		System.out.println("执行add方法");
		return numA+numB;
	}
	@Override
	public int reduce(int numA,int numB){
		System.out.println("执行reduce方法");
		return numA-numB;
	}
	@Override
	public int div(int numA,int numB){
		System.out.println("执行div方法");
		return numA/numB;
	}
	@Override
	public int multi(int numA,int numB){
		System.out.println("执行multi方法");
		return numA*numB;
	}
}

