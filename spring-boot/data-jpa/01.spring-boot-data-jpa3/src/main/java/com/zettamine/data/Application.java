package com.zettamine.data;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zettamine.data.entities.Contact;
import com.zettamine.data.entities.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ContactRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Contact con = repo.contactName("Karthik");
		logger.info("{}",con);
		
		List<Contact> list = repo.myCustomGet("K");
		
		list.forEach(x->logger.info("{}",x));
		
		(repo.deleteNativeQuery(103)).forEach(x->logger.info("{}",x));
		//repo.deleteByContactName("Kiran Kumar");
	}
	

}
