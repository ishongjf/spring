package com.hongjf.constructor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName CircularDependenciesFactoryPostProcessor
 * @Author hongjf
 * @Date 2021/7/5 下午5:07
 * @Version 1.0
 */
@Component
public class CircularDependenciesFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		ScannedGenericBeanDefinition fBeanDefinition = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("f");
		fBeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		ScannedGenericBeanDefinition gBeanDefinition = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("g");
		gBeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
	}
}
