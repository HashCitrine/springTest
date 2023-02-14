package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Value("${index}")
	String index;

	@RequestMapping("/")
	public String helloWorld() {
		return index;
	}
}
