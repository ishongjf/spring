package com.hongjf.beanPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanPostProcessor
 * @Author hongjf
 * @Date 2021/5/20 下午10:32
 * @Version 1.0
 */
@Slf4j
@Component
public class MyBeanPostProcessor implements BeanPostProcessor, Ordered {

	@Autowired
	private A a;

	public MyBeanPostProcessor() {
		log.info("-----MyBeanPostProcessor create,");
	}

	@Override
	public int getOrder() {
		return -1;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
