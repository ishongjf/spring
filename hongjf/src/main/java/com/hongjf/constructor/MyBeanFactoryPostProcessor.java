package com.hongjf.constructor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanFactoryPostProcessor
 * @Author hongjf
 * @Date 2021/6/25 下午4:43
 * @Version 1.0
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition bd = (GenericBeanDefinition) beanFactory.getBeanDefinition("a");
		bd.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
	}
}
