package com.hongjf.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/6/20 下午3:17
 * @Version 1.0
 */
@Slf4j
@Component
public class A {

	@Autowired
	private B b;

	public void db(){}

	public void printf(){
		log.info(">>>>>>>>>>>>A#printf invoke");
	}
}
