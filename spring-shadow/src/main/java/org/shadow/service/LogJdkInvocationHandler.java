package org.shadow.service;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@Slf4j(topic = "e")
public class LogJdkInvocationHandler implements InvocationHandler {
	Object target;
	public LogJdkInvocationHandler(Object target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log.debug("jdk---start log-----proxy");
		Object invoke = null;
		try {
			invoke = method.invoke(target, args);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return invoke;
	}
}
