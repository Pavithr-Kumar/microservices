package com.zettamine.boot.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;


@Controller
public class EmployeeController {
	public EmployeeController() {
		LoggerFactory.getLogger(EmployeeController.class).info("\033[32mEmployee Controller  Bean\033[0m");
	}
	

}