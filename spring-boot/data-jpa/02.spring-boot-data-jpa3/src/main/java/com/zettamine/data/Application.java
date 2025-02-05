package com.zettamine.data;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zettamine.data.entities.Customer;
import com.zettamine.data.entities.Product;
import com.zettamine.data.repository.CustomerRepo;
import com.zettamine.data.repository.ProductRepo;

@SpringBootApplication
public class Application {
	
	
	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(Application.class, args);
	ProductRepo pRepo = context.getBean(ProductRepo.class);
	CustomerRepo cRepo = context.getBean(CustomerRepo.class);
		//repo.saveAll(Arrays.asList(new Product("Computer",70000f),new Product("Mobile",13000f),new Product("Television",15000f)));
	
		Customer c1 = new Customer("Ravi Kumar", "Hyderabad",null);
		c1.setProduct(new Product("Bat", 3000f));
		//cRepo.save(c1);
		
		pRepo.deleteById(1);
		
	}

}
