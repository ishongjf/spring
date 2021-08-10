package com.hongjf.aop;

import org.springframework.aop.config.AopConfigUtils;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanFactoryPostprocessor
 * @Author hongjf
 * @Date 2021/7/18 下午9:53
 * @Version 1.0
 */
@Component
public class MyBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractAutoProxyCreator bean = (AbstractAutoProxyCreator) beanFactory.getBean(AopConfigUtils.AUTO_PROXY_CREATOR_BEAN_NAME);
		/*bean.setCustomTargetSourceCreators((beanClass, beanName) -> {
			try {
				return new SingletonTargetSource(beanClass.newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			return null;
		});*/
	}
}
