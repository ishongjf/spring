package com.hongjf.beanDefinition;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/5/18 下午2:02
 * @Version 1.0
 */
@Slf4j
public class A {

	public A(){
		log.debug("a-------------->");
	}


	public C c(){
		log.debug("c --->factoryMethod");
		return new C();
	}

}
