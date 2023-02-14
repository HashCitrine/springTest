package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World!";
	}

	@RequestMapping("/update")
	public String update() {
		return "update";
	}
}
