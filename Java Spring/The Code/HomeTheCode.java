package com.example.theCode.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeTheCode {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

	@PostMapping("/code")
	public String scode(@RequestParam("theCode") String tcode, Model model, HttpSession mysession) {
		Object theCode;
		if(theCode.equals("Bushido")) {
			return "code.jsp";			
		}
		model.addAttribute("theCode", tcode);
	}
}
