package org.shadow.test;

import lombok.extern.slf4j.Slf4j;
import org.shadow.service.LogInvocationHanlder;
import org.shadow.service.LogJdkInvocationHandler;
import org.shadow.service.UserService;
import org.shadow.service.impl.UserServiceImpl;
import org.shadow.util.CInvocationHandler;
import org.shadow.util.ProxyCustom;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Slf4j(topic = "e")
public class TestService {
	public static void main(String[] args) {
		CInvocationHandler cInvocationHandler = new LogInvocationHanlder(new UserServiceImpl());
		UserService service = (UserService) ProxyCustom.createProxy(UserService.class, cInvocationHandler);
		service.del();

//		InvocationHandler invocationHandler = new LogJdkInvocationHandler(new UserServiceImpl());
//		UserService service = (UserService) Proxy.newProxyInstance(TestService.class.getClassLoader(), new Class[]{UserService.class}, invocationHandler);
//		service.del();
	}
}
