package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

	@RequestMapping("/add")
	public String index(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		return "Greetings from Spring Boot!" + (num1 + num2);
	}

}
