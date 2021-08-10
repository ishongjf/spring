package com.hongjf.register;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

/**
 * @ClassName BeanNameGenerator
 * @Author hongjf
 * @Date 2021/5/5 下午9:34
 * @Version 1.0
 */
public class MyBeanNameGenerator implements BeanNameGenerator {
	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		return "aaa";
	}
}
