package com.shadow.example.proxy;

import java.lang.reflect.Method;

public interface CInvocationHandler {

	public Object invoke(Object proxy, Method md,Object...args);
}
