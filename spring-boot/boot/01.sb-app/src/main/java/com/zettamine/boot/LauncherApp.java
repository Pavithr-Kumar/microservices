package com.zettamine.boot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan

public class LauncherApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Application app = context.getBean("application",Application.class);
		System.out.println(app);
		System.out.println("no of Beans :"+context.getBeanDefinitionCount());
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
		context.close();
		

	}

}
