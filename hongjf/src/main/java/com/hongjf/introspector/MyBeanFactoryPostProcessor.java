package com.hongjf.introspector;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanFactyoryPostProcessor
 * @Author hongjf
 * @Date 2021/5/30 下午4:56
 * @Version 1.0
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition a = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		a.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
	}
}
