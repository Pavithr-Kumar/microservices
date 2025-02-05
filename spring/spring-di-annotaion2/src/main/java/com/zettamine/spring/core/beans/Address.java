package com.zettamine.spring.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Address {

	@Value("Gajuwaka")
	private String city;
	@Value("Andhra Pradesh")
	private String state;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
}
