package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test2Controller {

	@GetMapping("/Test2")
	public String greet() {
		String msg="Hii...I am Tester2";
		return msg;
		
	}
}
