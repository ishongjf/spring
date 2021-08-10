package com.hongjf.postProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName Phone
 * @Author hongjf
 * @Date 2021/4/25 下午1:28
 * @Version 1.0
 */
@Slf4j
@Component
public class Phone implements Computer{

	private Computer computer;

	@Override
	public void setMac(Mac mac) {
		this.computer = new Mac();
	}

	public void print() {
		log.info(">>>>>>>>>>>>>>applicationContext:[{}]", computer);
	}
}
