package com.hongjf.beanPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName B
 * @Author hongjf
 * @Date 2021/7/6 下午3:20
 * @Version 1.0
 */
@Slf4j
@Component
public class B implements InitializingBean, DisposableBean {

	@PostConstruct
	public void postConstruct(){
		log.info(">>>>>>>>>>>>>>>b:PostConstruct");
	}

	@PreDestroy
	public void preDestroy(){
		log.info(">>>>>>>>>>>>>>>b:PreDestroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info(">>>>>>>>>>>>>>>b,init-method");
	}

	@Override
	public void destroy() throws Exception {
		log.info(">>>>>>>>>>>>>>>b,destroy-method");
	}
}
