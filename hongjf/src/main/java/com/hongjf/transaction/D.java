package com.hongjf.transaction;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName D
 * @Author hongjf
 * @Date 2021/7/11 下午2:11
 * @Version 1.0
 */
@Component
public class D {

	@Transactional(rollbackFor = Exception.class)
	public void db(){}

}
