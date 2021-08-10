package com.hongjf.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestFrozen
 * @Author hongjf
 * @Date 2021/5/4 下午4:57
 * @Version 1.0
 */
@Component
public class TestFrozenPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition b = (AbstractBeanDefinition) beanFactory.getBeanDefinition("b");
		//冻结容器
		//仅仅是对本次实例化生效
		//冻结的是beanDefinition
		beanFactory.freezeConfiguration();
//		b.setScope(AbstractBeanDefinition.SCOPE_PROTOTYPE);
		b.setLazyInit(true);
	}

}
