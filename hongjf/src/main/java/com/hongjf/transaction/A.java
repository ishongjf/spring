package com.hongjf.transaction;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/7/7 下午10:05
 * @Version 1.0
 */
@Component
public class A implements E {

	@Transactional(rollbackFor = Exception.class)
	public void db() {

	}

	@Override
	public void printf() {

	}
}
