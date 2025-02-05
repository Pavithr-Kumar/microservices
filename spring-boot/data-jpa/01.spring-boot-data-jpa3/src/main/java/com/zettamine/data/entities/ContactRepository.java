package com.zettamine.data.entities;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ContactRepository extends CrudRepository<Contact, Serializable> {

	Contact findByContactName(String string);

	//Contact findmMyByContactName(String string);

	//Contact findByMyContactName(String string);

//	Contact findAllkjwadnaskjxsakasByContactName(String string);

	//Contact findContactName(String string);

	Contact contactName(String string);
	
    @Query(value = "select ct from Contact ct where ct.contactName like :string%" )
	List<Contact> myCustomGet(String string);

    @Query(value = "select * from contact_master", nativeQuery = true)
	List<Contact> deleteNativeQuery(int i);

//    @Transactional
//	void deleteByContactName(String input);
    
    
    
}
