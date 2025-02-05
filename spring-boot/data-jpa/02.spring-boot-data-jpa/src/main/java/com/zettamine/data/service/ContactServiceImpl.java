package com.zettamine.data.service;

import java.util.List;

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
	
	

	
}
