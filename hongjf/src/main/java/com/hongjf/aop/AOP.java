package com.hongjf.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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

	@Pointcut("within(com.hongjf.aop.A)")
	public void pointcut(){
	}

	@Pointcut("within(com.hongjf.aop.C)")
	public void cPointcut(){

	}

	/**
	 * spring AOP中的每个通知方法，最终都会变成一个advisor，
	 * 一个advisor中包含pointcut（注解中的pointcut信息）和advice，以及beanFactory等
	 * advice里包含了方法信息和pointcut（注解中的pointcut信息）、参数信息
	 * @param joinPoint
	 */
	@Before("pointcut()")
	public void aaa(JoinPoint joinPoint){
		log.info("-----------------A:before");
	}

	@Before("cPointcut()")
	public void ccc(JoinPoint joinPoint){
		log.info("-----------------C:before");
	}
}
