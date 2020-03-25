package com.bw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class nihaocontroller {
	/* 我很快乐,啦啦啦啦 */
	/* 哈哈哈哈哈哈哈哈 */
	@RequestMapping("hello")
	public String hello() {
		
		return "hello";
	}
}
