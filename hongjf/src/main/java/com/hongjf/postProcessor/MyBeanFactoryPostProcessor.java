package com.hongjf.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanFactoryPostProcessor
 * @Author hongjf
 * @Date 2021/4/25 下午1:29
 * @Version 1.0
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		/*ScannedGenericBeanDefinition db = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("phone");
		db.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		beanFactory.ignoreDependencyInterface(Computer.class);*/
		System.out.println("MyBeanFactoryPostProcessor的postProcessBeanFactory开始执行了啦啦啦!!!!");
	}
}
