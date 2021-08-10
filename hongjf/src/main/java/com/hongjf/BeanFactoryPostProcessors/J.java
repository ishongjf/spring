package com.hongjf.BeanFactoryPostProcessors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName J
 * @Author hongjf
 * @Date 2021/5/17 下午5:02
 * @Version 1.0
 */
@Slf4j
@Component
public class J {

	@Autowired
	private K ssss;
}
