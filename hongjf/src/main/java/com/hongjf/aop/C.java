package com.hongjf.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName C
 * @Author hongjf
 * @Date 2021/7/18 下午9:53
 * @Version 1.0
 */
@Slf4j
@Component
@Scope("prototype")
public class C {

	public void printf(){
		log.info(">>>>>>>>>>>>C#printf invoke");
	}


}
