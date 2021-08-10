package com.hongjf.initialize;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanFactoryPostprocessor
 * @Author hongjf
 * @Date 2021/7/18 下午3:20
 * @Version 1.0
 */
@Component
public class MyBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		ScannedGenericBeanDefinition beanDefinition = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("a");
		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
	}
}
