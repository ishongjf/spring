package com.hongjf.beanPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/5/20 下午10:19
 * @Version 1.0
 */
@Slf4j
@Component
public class A {

//	@Autowired
	public A() {
		log.info(">>>>>>A create");
	}

	public void printf() {
		log.info("---------A.printf()");
	}

}
