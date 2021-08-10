package com.hongjf.introspector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/5/30 下午4:54
 * @Version 1.0
 */
@Slf4j
@Component
@PropertySource("classpath:application.properties")
public class A {

//	@Autowired
	private B b;

//	@Value("${source.name}")
	private String name;

	public A() {
		log.info(">>>>>>>>A create");
	}

	@Autowired
	public void setC(C c) {
		log.info(">>>>>>>A-setC invoke");
	}

	@Autowired
	public void scdd(C c) {
		log.info(">>>>>>>A-scdd invoke");
	}



}
