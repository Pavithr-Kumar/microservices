package com.zettamine.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "CONTACT_MASTER")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Contact {
	@Id
	private Integer contactId;
	private String contactName;
	private String contactNumber;
	@Override
	public String toString() {
		return String.format( "Contact %d   |  %-15s  |  %-10s",contactId,contactName,contactNumber);
	}
	

}
