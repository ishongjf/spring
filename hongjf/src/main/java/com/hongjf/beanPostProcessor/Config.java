package com.hongjf.beanPostProcessor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName Config
 * @Author hongjf
 * @Date 2021/5/20 下午10:20
 * @Version 1.0
 */
@ComponentScan("com.hongjf.beanPostProcessor")
@EnableAspectJAutoProxy
public class Config {
}
