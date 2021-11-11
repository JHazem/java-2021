package com.hazem.codingcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodingControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingControllerApplication.class, args);
	}
	
	@RequestMapping("/coding")
	public String coding1() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/coding/python")
	public String python1() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/coding/java")
	public String java1() {
		return "Java/Spring is better!";
	}
}
