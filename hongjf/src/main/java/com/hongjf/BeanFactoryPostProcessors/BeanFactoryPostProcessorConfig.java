package com.hongjf.BeanFactoryPostProcessors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName BeanFactoryPostProcessorConfig
 * @Author hongjf
 * @Date 2021/5/14 下午1:57
 * @Version 1.0
 */
@ComponentScan("com.hongjf.BeanFactoryPostProcessors")
@PropertySource("classpath:application.properties")
@Import({A.class, F.class})
public class BeanFactoryPostProcessorConfig extends E implements C {
	@Value("${source.name}")
	private String name;

	@Value("${source.salary}")
	private String salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}
