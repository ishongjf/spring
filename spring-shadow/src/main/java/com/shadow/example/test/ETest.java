package com.shadow.example.test;

import com.shadow.app.Appconfig;
import com.shadow.example.dependsOn.A;
import com.shadow.example.app.EApp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

@Slf4j(topic = "e")
public class ETest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(EApp.class);
		A bean = ac.getBean(A.class);
		//Proxy.newProxyInstance()
//		log.debug("d-age:{}",bean.getB().getC().getD().getAge());

	}
}
