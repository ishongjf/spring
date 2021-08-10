package com.hongjf.beanPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName AOP
 * @Author hongjf
 * @Date 2021/5/20 下午10:19
 * @Version 1.0
 */
@Slf4j
@Aspect
@Component
public class AOP {

	@Pointcut("within(com.hongjf.beanPostProcessor.A)")
	public void pointcut(){
	}


	@Before("pointcut()")
	public void before(){
		log.info("-----------------before");
	}
}
