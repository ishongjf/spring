package com.hongjf.initialize;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/7/18 下午2:06
 * @Version 1.0
 */
@Slf4j
@Component
public class A implements InitializingBean, BeanNameAware, BeanClassLoaderAware, BeanFactoryAware {


	@Resource
	private B b;

	@PostConstruct
	public void postConstruct1111(){
		log.info(">>>>>>>>>>>>>>>>>>postConstruct1111() invoke");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info(">>>>>>>>>>>>>>>>>>afterPropertiesSet() invoke");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		log.info(">>>>>>>>>>>>>>>>>>setBeanClassLoader() invoke");
	}

	@Override
	public void setBeanName(String name) {
		log.info(">>>>>>>>>>>>>>>>>>setBeanName() invoke");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		log.info(">>>>>>>>>>>>>>>>>>setBeanFactory() invoke");
	}

	@Resource
	public void resourceMethod(C c){
		log.info(">>>>>>>>>>>>>>>>>>resourceMethod() invoke");
	}

	@Resource
	public void setResourceMethod(C c){
		log.info(">>>>>>>>>>>>>>>>>>setResourceMethod() invoke");
	}
}
