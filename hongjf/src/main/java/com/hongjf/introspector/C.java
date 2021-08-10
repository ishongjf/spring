package com.hongjf.introspector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/5/30 下午4:54
 * @Version 1.0
 */
@Slf4j
@Component
public class C {

	public C() {
		log.info(">>>>>>>>C create");
	}
}
