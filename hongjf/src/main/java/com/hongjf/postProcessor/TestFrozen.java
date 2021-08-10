package com.hongjf.postProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestFrozen
 * @Author hongjf
 * @Date 2021/5/4 下午4:59
 * @Version 1.0
 */
public class TestFrozen {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		Class[] clazz = new Class[] {B.class,TestFrozenPostProcessor.class};
		ac.register(clazz);
		ac.refresh();
//		ac.getBean(B.class);
		System.out.printf("");
	}
}
