package com.zettamine.boot.configs;

import java.util.ArrayList;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfigs {
	public EmployeeConfigs() {
		LoggerFactory.getLogger(EmployeeConfigs.class).info("\033[32mEmployee configs Bean\033[0m");
	}
	
	@Bean
	 ArrayList<Integer> getList() {
		LoggerFactory.getLogger(EmployeeConfigs.class).info("\033[32mBean Initialized\033[0m");
		return new ArrayList<Integer>();
	}

}
