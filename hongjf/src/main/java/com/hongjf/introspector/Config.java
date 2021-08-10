package com.hongjf.introspector;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName Config
 * @Author hongjf
 * @Date 2021/5/30 下午4:58
 * @Version 1.0
 */
@ComponentScan("com.hongjf.introspector")
@PropertySource("classpath:application.properties")
public class Config {
}
