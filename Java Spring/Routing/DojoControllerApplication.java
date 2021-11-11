package com.hazem.codingcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DojoControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoControllerApplication.class, args);
	}
	
	@RequestMapping("/dojo")
	public String dojo (@PathVariable String dojo) {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/dojo/burbank")
	public String burbank (@PathVariable String burbank) {
		return "Burbank Dojo is located in Southern California";
	}
	
	@RequestMapping("/dojo/san-jose")
	public String san (@PathVariable String san) {
		return "SJ dojo is the headquarters";
	}
	
}
