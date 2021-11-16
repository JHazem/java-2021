package com.example.date.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		Date mydate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd mm yyyy");
		String formattedDate = formatter.format(mydate);
		model.addAttribute("date", formattedDate);
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		Date mydate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss" );
		String formattedTime = formatter.format(mydate);
		model.addAttribute("date", formattedTime);
		return "time.jsp";
	}

}