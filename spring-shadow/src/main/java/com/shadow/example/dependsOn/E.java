package com.shadow.example.dependsOn;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationHandler;
@Slf4j(topic = "e")
public class E implements I {


	@Override
	public String md(int a, String b) {
		log.debug("a-{},b-{}",a,b);
		System.out.println("xxxx");
		return "a";
	}
}
