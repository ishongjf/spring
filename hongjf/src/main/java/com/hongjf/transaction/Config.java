package com.hongjf.transaction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName COnfig
 * @Author hongjf
 * @Date 2021/7/7 下午10:04
 * @Version 1.0
 */
@ComponentScan("com.hongjf.transaction")
@EnableTransactionManagement
public class Config implements B{
	@Override
	public void printf() {

	}
}
