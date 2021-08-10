package com.hongjf.mvc;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @ClassName MyServletContainerInitializer
 * @Author hongjf
 * @Date 2021/7/5 上午9:43
 * @Version 1.0
 */
@Slf4j
@HandlesTypes(A.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		for (Class<?> aClass : c) {
			log.info("=======onStartup:" + aClass.getName());
		}
	}
}
