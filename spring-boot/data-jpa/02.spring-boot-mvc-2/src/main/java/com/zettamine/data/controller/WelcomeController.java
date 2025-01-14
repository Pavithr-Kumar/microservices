package com.zettamine.data.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	
	
	
	@GetMapping("/welcome")
	public String showWelcome(Model m) {
		
		m.addAttribute("message","Welcome to Zettamine");
		return "index";
	}
	
	@GetMapping("/welcome/new")
	public String returnAnObject(Model m) {
		
		m.addAttribute("obj",Arrays.asList("Ravi","Raju","Hari","Kiran","Jaggu","Punya Koti","HariNadh","Bharath"));
		return "new";
	}

	@PostMapping("/login")
	public String validate(@RequestParam String name) {
		System.out.println(name);
		if(name.equals("ravi"))
			return "index";
		return "invalid";
	}
	
	@GetMapping("/login")
	public String home() {
		return "login";
	}
	
	@GetMapping("/student/delete/{id}")
	public String deleteStudent(Model m, @PathVariable(name = "id") String id) {
		m.addAttribute("name",id);
		return "delete";
	}
	
	@GetMapping("/get-object")
	public List getModel(Model model) {
		model.addAttribute("obj",Arrays.asList("Ravi","Raju","Hari","Kiran","Jaggu","Punya Koti","HariNadh","Bharath"));
		return Arrays.asList("Ravi","Raju","Hari","Kiran","Jaggu","Punya Koti","HariNadh","Bharath");
		
	}
}
