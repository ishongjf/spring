package com.hongjf.BeanFactoryPostProcessors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/5/16 下午5:01
 * @Version 1.0
 */
@Slf4j
public class A implements ImportSelector {

	public A() {
		log.debug("AAAAA");
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.hongjf.BeanFactoryPostProcessors.B"};
	}
}
