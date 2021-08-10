package com.hongjf.postProcessor;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestMerged
 * @Author hongjf
 * @Date 2021/5/4 下午6:52
 * @Version 1.0
 */
public class TestMerged {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		RootBeanDefinition p = new RootBeanDefinition(A.class);
		p.setScope(AbstractBeanDefinition.SCOPE_PROTOTYPE);

		ChildBeanDefinition c = new ChildBeanDefinition("p");

		ac.registerBeanDefinition("p",p);
		ac.registerBeanDefinition("c",c);
		ac.refresh();
		System.out.println("");
	}

}
