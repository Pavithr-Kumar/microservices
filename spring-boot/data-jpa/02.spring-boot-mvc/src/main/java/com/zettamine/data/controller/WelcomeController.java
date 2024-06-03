package com.zettamine.data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public String show(Model m) {
		
		m.addAttribute("message","Welcome to Zettamine");
		return "index";
	}

}
