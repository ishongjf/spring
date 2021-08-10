package com.shadow.example.proxy;

import com.shadow.example.dependsOn.I;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IHProxy implements CInvocationHandler {
	I i;

	public IHProxy(I i){
		this.i = i;
	}

	@Override
	public Object invoke(Object proxy, Method md,Object... args) {
		try {
			System.out.println("proxy Logic");
			return md.invoke(i,args);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
