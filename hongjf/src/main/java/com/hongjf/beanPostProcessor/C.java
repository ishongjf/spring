package com.hongjf.beanPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName C
 * @Author hongjf
 * @Date 2021/7/6 下午3:26
 * @Version 1.0
 */
@Slf4j
@Component
public class C {

	@PostConstruct
	public void init() {
		log.info(">>>>>>>>>>>>>>>>C;init-method");
	}

	@PreDestroy
	public void destory() {
		log.info(">>>>>>>>>>>>>>>>C;destory-method");
	}

}
