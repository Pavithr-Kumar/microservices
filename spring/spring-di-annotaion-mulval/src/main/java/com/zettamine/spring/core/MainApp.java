package com.zettamine.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.zettamine.spring.core.beans.Employee;

@Configuration
@ComponentScan
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		
		((ConfigurableApplicationContext)context).close();

	}

}
