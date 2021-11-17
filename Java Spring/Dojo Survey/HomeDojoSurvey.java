package com.example.dojoSurvy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeDojoSurvey {
	@RequestMapping("/")
	public String dojoSurvey() {
		return "index.jsp";
	}
	@RequestMapping("/result")
	public String resultSurvey(@RequestParam("firstName") String firstName,
			@RequestParam("locatin") String location,
			@RequestParam( "program") String program) {
			model.addAttribute("firstName", fName);
			model.addAttribute("location", location);
			model.addAttribute("program", program);
		return "result.jsp";
	}

}
