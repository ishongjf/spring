package com.hongjf.postProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName TestConfig
 * @Author hongjf
 * @Date 2021/4/28 下午5:49
 * @Version 1.0
 */
//@Configuration
public class TestConfig {
	@Bean("d")
	public Computer d(){
		return new Mac();
	}

	@Bean("d")
	public Computer f(){
		return new HuaweiMac();
	}

}
