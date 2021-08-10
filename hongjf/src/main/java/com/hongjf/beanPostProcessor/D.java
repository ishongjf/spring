package com.hongjf.beanPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName D
 * @Author hongjf
 * @Date 2021/7/6 下午3:37
 * @Version 1.0
 */
@Slf4j
@Component
public class D implements InitializingBean, DisposableBean {

	@Override
	@PreDestroy
	public void destroy() throws Exception {
		log.info(">>>>>>>>>>>>>>>>>>>>D:destroy");
	}

	@Override
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		log.info(">>>>>>>>>>>>>>>>>>>>D:init");
	}
}
