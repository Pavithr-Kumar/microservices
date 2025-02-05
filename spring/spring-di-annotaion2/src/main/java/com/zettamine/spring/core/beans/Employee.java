package com.zettamine.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.val;

@Component
public class Employee {
	
	@Value("Ravi Kumar")
	private String empName;
	@Autowired
	private Address address;
	
	
//	@Autowired
//	public Employee( Address address) {
//		super();
//		this.address = address;
//	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}

   
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

     
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
