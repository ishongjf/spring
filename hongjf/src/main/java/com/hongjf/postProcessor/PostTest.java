package com.hongjf.postProcessor;

import com.hongjf.register.Config;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName PostTest
 * @Author hongjf
 * @Date 2021/4/25 下午1:32
 * @Version 1.0
 */
public class PostTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
//		ac.getBeanFactory().registerSingleton("test",B.class);
		ac.registerBeanDefinition("a",new RootBeanDefinition(C.class));
//		ac.refresh();
		System.out.println("");
	}

}
