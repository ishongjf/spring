package com.hongjf.register;

import com.hongjf.postProcessor.MyBeanFactoryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.PriorityOrdered;

/**
 * @ClassName OrderBeanFactoryPostProcessor
 * @Author hongjf
 * @Date 2021/5/9 下午3:56
 * @Version 1.0
 */
public class OrderBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("OrderBeanFactoryPostProcessor的postProcessBeanFactory开始执行了啦啦啦！！！");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("OrderBeanFactoryPostProcessor的postProcessBeanDefinitionRegistry开始执行了啦啦啦！！！");
		registry.registerBeanDefinition("my", new RootBeanDefinition(MyBeanFactoryPostProcessor.class));
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
