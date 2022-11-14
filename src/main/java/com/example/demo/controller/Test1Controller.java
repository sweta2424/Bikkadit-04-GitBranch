package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test1Controller {

	@GetMapping("/Test1")
	public String greet() {
		String msg="Hii...I am Tester1";
		return msg;
		
	}
}
