package com.able.spi;

import java.util.ServiceLoader;

/**
 * SPI机制
 * 		1 当服务提供者提供了接口的一种具体实现后：
 * 		在工程的META-INF/services目录下创建一个 以 '接口全限定名'为命名的文件，
 * 		内容为实现类的全限定名
 * 		2 接口实现类所在的工程classpath中；
 * 		3 主程序通过java.util.ServiceLoder动态装载实现模块 他通过扫描
 * 	META-INF/services目录下的配置文件找到实现类的全限定名
 * 		4 SPI机制必修携带一个不带参数的构造方法
 *
 *
 *
 * @param
 * @author jipeng
 * @date 2020-09-21 18:43
 */
public class MainClass {
	public static ServiceLoader<IParseDoc> serviceLoader=ServiceLoader.load(IParseDoc.class);
	public static void main(String[] args){
		ServiceLoader<IParseDoc> serviceLoader=ServiceLoader.load(IParseDoc.class);
		for (IParseDoc iParseDoc : serviceLoader) {
			iParseDoc.parse();
		}
	}
}

