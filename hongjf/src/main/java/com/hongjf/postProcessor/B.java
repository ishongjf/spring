package com.hongjf.postProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName B
 * @Author hongjf
 * @Date 2021/4/25 下午10:11
 * @Version 1.0
 */
@Slf4j
//@Component
public class B {
	public B() {
		log.info("b被创建了");
	}
}
