package com.example.languages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/languages")
	public String table() {
		return "index.jsp";
	}
	
	
	@GetMapping("/languages/0")
	public String zero() {
		return "zero.jsp";
	}
	
	
	@GetMapping("/languages/edit/0")
	public String editpage() {
		return "editpage.jsp";
	}

}
