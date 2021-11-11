package com.hazem.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello Human";
	}
	@RequestMapping("/hello")
	public String helloKhoa(@RequestParam(value="q") String firstName) {
		return "Hello " +firstName;
	}
}

