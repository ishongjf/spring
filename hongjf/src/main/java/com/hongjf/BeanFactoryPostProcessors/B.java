package com.hongjf.BeanFactoryPostProcessors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName B
 * @Author hongjf
 * @Date 2021/5/16 下午5:03
 * @Version 1.0
 */
@Slf4j
public class B {

	public B() {
		log.debug("BBBBBB");
	}

	@Bean
	public H h() {
		return new H();
	}

	@Bean
	public G g(){
		return new G();
	}
}
