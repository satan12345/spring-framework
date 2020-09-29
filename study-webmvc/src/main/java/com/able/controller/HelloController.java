package com.able.controller;

import com.able.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @param
 * @author jipeng
 * @date 2020-09-29 11:24
 */
@Controller
public class HelloController {

	@Resource
	HelloService helloService;
	@GetMapping("hello")
	@ResponseBody
	public String hello(){
		helloService.sayHello();
		return "success";
	}
}

