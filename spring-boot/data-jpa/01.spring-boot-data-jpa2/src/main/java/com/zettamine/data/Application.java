package com.zettamine.data;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.zettamine.data.entities.Contact;
import com.zettamine.data.repository.ContactRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ContactRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	@Transactional(rollbackFor = RuntimeException.class)
	public void run(String... args) {
		Logger log = LoggerFactory.getLogger(Application.class);
		Optional<Contact> optCon = repo.findById(101);
		
		repo.save(new Contact(111, "Karthik", "1129383922"));
		
		if(optCon.isPresent())
			log.info("{}",optCon.get());
		else {
			log.info("No Match records found, so transaction is rolled back");
			throw new RuntimeException();
		}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		log.info("\033[32m {}",con);
//		
//		log.info("*".repeat(80));
//		Iterable<Contact> contacts = repo.findAll();
//		contacts.forEach(x-> log.info("\033[32m {}",x));
//		
//		log.info("*".repeat(80));
//		contacts =repo.findAllById(Arrays.asList(101,102,103,200,105));
//		contacts.forEach(x-> log.info("\033[32m {}",x));
//		
//	    log.info("*".repeat(80));
//		repo.deleteById(101);
//		 log.info("---------Deleted----------");
//		
//		log.info("*".repeat(80));
//		contacts = repo.findAll();
//		contacts.forEach(x-> log.info("\033[32m {}",x));
		
		
	}

}
