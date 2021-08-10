package com.hongjf.BeanFactoryPostProcessors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName F
 * @Author hongjf
 * @Date 2021/5/17 上午9:32
 * @Version 1.0
 */
@Slf4j
public class F implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		log.debug("F registerBeanDefinitions invoke");
	}
}
