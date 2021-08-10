package com.hongjf.autowire;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/7/6 下午1:25
 * @Version 1.0
 */
@Slf4j
@Component
public class A {

	private List<B> bList;

	private Map<String, B> bMap;

	public void setE(E e) {
		this.e = e;
	}

	private E e;

	public void print() {
		for (B b : bList) {
			log.info(">>>>>>>>>>>>>>>>>>b:" + b.getClass());
		}
		for (Map.Entry<String, B> entry : bMap.entrySet()) {
			log.info("key:[{}],value:[{}]", entry.getKey(), entry.getValue());
		}
		log.info(">>>>>>>>>E:[{}]", e);
	}

	public void setBList(List<B> bList) {
		this.bList = bList;
	}

	public void setBMap(Map<String, B> bMap) {
		this.bMap = bMap;
	}
}
