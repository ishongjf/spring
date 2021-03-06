package com.hongjf.introspector;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName User
 * @Author hongjf
 * @Date 2021/5/22 下午7:37
 * @Version 1.0
 */
@Slf4j
public class User {

	private Integer age;

	private String name;

	private Integer sex;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
}
