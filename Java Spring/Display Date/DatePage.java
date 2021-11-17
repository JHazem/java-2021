package com.example.date.controllers;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateCtrl {
	@RequestMapping("/date")
	public String date(Model model) {
    		String datePattern = "dd, MMMMM, yyyy";
		    SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
		    String date = dateFormat.format(new Date());	
		    model.addAttribute("date", date);
	    	return "date.jsp";
}
