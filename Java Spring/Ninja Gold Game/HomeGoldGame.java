package com.example.ninja.controllers;


	import java.util.ArrayList;

	import javax.servlet.http.HttpSession;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class HomeGoldGame {
		@RequestMapping("/")
		public String gold(HttpSession session) {
			if(session.getAttribute("gold") == null) {
				session.setAttribute("gold", 0);
				session.setAttribute("activities", new ArrayList<String>());
			}
			return "index.jsp";
		}
}