package com.hongjf.postProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @ClassName C
 * @Author hongjf
 * @Date 2021/4/25 下午10:12
 * @Version 1.0
 */
@Component
public class C {

	@Autowired
	private B b;

}
