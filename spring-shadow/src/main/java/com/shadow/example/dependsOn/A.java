package com.shadow.example.dependsOn;

import com.shadow.example.proxy.CProxy;
import com.shadow.example.proxy.IHProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Component()
@DependsOn("b")
public class A  implements InvocationHandler {


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		return null;
	}

	public static void main(String[] args) throws Exception {
		I i = (I) CProxy.newProxyInstance(I.class, new IHProxy(new E()));
		i.md(2,"c");
	}
}
