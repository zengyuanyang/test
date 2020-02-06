package com.mine.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class SpringMVCTest {
	@RequestMapping(value="index")
	public String test() {
		System.out.println("这是我的第一个SpringMVC");
		return "/user/index";
	}
}
