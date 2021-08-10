package com.hongjf.postProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/4/25 下午10:11
 * @Version 1.0
 */
@Component
public class A {

	@Autowired
	private B b;

}
