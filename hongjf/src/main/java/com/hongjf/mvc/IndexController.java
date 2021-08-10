package com.hongjf.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Author hongjf
 * @Date 2021/7/4 下午5:21
 * @Version 1.0
 */
@Controller
public class IndexController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("===================controller================");
		return "hello";
	}


}
