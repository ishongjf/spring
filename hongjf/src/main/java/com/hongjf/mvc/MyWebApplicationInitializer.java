package com.hongjf.mvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @ClassName MyWebApplicationInitializer
 * @Author hongjf
 * @Date 2021/7/4 下午5:18
 * @Version 1.0
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) {
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(Config.class);
		ac.setServletContext(servletContext);
		DispatcherServlet servlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/*");
	}
}
