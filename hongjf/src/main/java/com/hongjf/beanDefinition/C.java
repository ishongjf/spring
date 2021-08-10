package com.hongjf.beanDefinition;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @ClassName A
 * @Author hongjf
 * @Date 2021/5/18 下午2:02
 * @Version 1.0
 */
@Slf4j
public class C {

	public C(){
		log.debug("C ------------------>");
	}

	public C(String s1){
		log.debug("C ------------------> s1");
	}

	public C(String s1,String s2){
		log.debug("C ------------------> s1,s2");
	}

	public C(A a){
		log.debug("C ------------------> a");
	}

	public C(B b){
		log.debug("C ------------------> b");
	}

	public C(A a,B b){
		log.debug("C ------------------> a,b");
	}

	public C(A a, B b, List<D> dList){
		log.debug("C ------------------> a,b,dList");
	}

	private A xxx;

	public void setA(A xxx) {
		log.debug("A ---->{}",xxx);
		this.xxx = xxx;
	}

	public A getXxx() {
		return xxx;
	}

	public void init() {
	    log.debug("C init");
	}

}
