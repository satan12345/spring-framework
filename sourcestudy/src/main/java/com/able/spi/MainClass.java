package com.able.spi;

import java.util.ServiceLoader;

/**
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

