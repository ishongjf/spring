package com.hongjf.mvc;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * @ClassName SpringApplication
 * @Author hongjf
 * @Date 2021/7/4 下午4:54
 * @Version 1.0
 */
public class SpringApplication {

	public static void run() throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8100);
		tomcat.addWebapp("/hongjf", "/Users/hongjf/Documents/project/spring-framework-5.2.x/");
		tomcat.start();
		tomcat.getServer().await();
	}

}
