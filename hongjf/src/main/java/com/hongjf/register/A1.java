package com.hongjf.register;

import org.springframework.stereotype.Component;

/**
 * @ClassName A1
 * @Author hongjf
 * @Date 2021/5/5 下午9:23
 * @Version 1.0
 */
@Component
public class A1 {

	public static B1 createB1(){
		return new B1();
	}

}
