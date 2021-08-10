package com.hongjf.BeanFactoryPostProcessors;

import org.springframework.context.annotation.Bean;

/**
 * @InterfaceName C
 * @Author hongjf
 * @Date 2021/5/16 下午5:12
 * @Version 1.0
 */
public interface C {

	@Bean
	default D d(){
		return new D();
	}

}
