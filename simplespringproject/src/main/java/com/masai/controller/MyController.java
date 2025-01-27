package com.masai.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Gurusharan i'm your first API do you like it";
	}
	

}
