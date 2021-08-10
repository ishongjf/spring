package org.shadow.service;

import lombok.extern.slf4j.Slf4j;
import org.shadow.util.CInvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@Slf4j(topic = "e")
public class LogInvocationHanlder implements CInvocationHandler {
	Object target;
	public LogInvocationHanlder(Object target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method md, Object... args) {
		log.debug("start log-----proxy");
		Object invoke = null;
		try {
			invoke = md.invoke(target, args);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return invoke;
	}
}
