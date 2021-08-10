package com.hongjf.autowire;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName AutowireBeanFactoryPostProcessor
 * @Author hongjf
 * @Date 2021/7/6 下午1:27
 * @Version 1.0
 */
@Component
public class AutowireBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		ScannedGenericBeanDefinition a = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("a");
		a.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		ScannedGenericBeanDefinition c = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("c");
		c.setAutowireCandidate(false);
	}
}
