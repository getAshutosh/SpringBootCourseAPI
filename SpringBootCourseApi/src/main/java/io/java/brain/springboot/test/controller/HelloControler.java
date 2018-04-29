package io.java.brain.springboot.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello";
	}

}
