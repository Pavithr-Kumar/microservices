package com.zettamine.spring.core.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zettamine.spring.core.beans.Employee;

@Configuration

public class EmpConfig {
	
	@Bean
	
	public Employee getEmployee() {
		return new Employee();
	}
	

}
