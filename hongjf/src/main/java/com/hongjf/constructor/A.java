package com.hongjf.constructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/6/25 下午4:14
 * @Version 1.0
 */
@Slf4j
@Component
public class A {

	//@Autowired(required = false)
	public A() {
		log.info(">>>>>>>>>>>>>>>>无参的的构造方法");
	}

	@Autowired(required = false)
	public A(String a) {
		log.info(">>>>>>>>>>>>>>>>String的的构造方法");
	}

	@Autowired(required = true)
	public A(B b) {
		log.info(">>>>>>>>>>>>>>>>参数B的的构造方法");
	}
	public A(D d) {
		log.info(">>>>>>>>>>>>>>>>参数D的的构造方法");
	}
	public A(E e) {
		log.info(">>>>>>>>>>>>>>>>参数E的的构造方法");
	}

	//@Autowired(required = false)
	/*public A(B b, C c) {
		log.info(">>>>>>>>>>>>>>>>参数B、C的的构造方法");
	}

	public A(C c, B b) {
		log.info(">>>>>>>>>>>>>>>>参数C、B的的构造方法");
	}*/

}
