package com.zettamine.data.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zettamine.data.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

	List<Contact> findByOrderByContactName();

	List<Contact> findByOrderByContactNameDesc();

	

}
