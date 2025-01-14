package com.zettamine.data.service;


import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zettamine.data.entities.Contact;
import com.zettamine.data.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
 private ContactRepository repo;
 
	public ContactServiceImpl(ContactRepository repo) {
	
	this.repo = repo;
}

	@Override
	public List<Contact> getContactInAscOfName() {
		
		return repo.findByOrderByContactName();
	}

	@Override
	public List<Contact> getContactInDescOfName() {
		return repo.findByOrderByContactNameDesc();
	}

	@Override
	public List<Contact> getAll() {
	return	repo.findAll(Sort.by("contactNumber","contactName").descending());
	}

	@Override
	public void printAllPages() {
		
		int noOfPages=(int) (repo.count()/4);
		if(noOfPages!=0)
			noOfPages++;
		for(int i=0;i<noOfPages;i++) {
			
			// PageRequest.of(0, noOfPages, Sort.by("contactName"));
			
			Page<Contact> page =repo.findAll(PageRequest.of(i, noOfPages, Sort.by("contactName").ascending().and(Sort.by("ContactId").descending())));
			LoggerFactory.getLogger(ContactServiceImpl.class).info("\033[032m{}/{}\033[0m",i+1,noOfPages);
			page.getContent().forEach(x->LoggerFactory.getLogger(ContactServiceImpl.class).info("\033[032m{}\033[0m",x));
			
			
		}
	}

	@Override
	public List<Contact> getByExmpl() {
		Contact con = new Contact();
		con.setContactName("Suresh");
		Example<Contact> exmpl = Example.of(con);
		return repo.findAll(exmpl);
	}
	
	
	
	

	
}
