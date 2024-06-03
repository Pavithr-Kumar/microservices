package com.zettamine.spring.core.beans;




public class Customer {
	private String custName;
	private Car car;
	public Customer(String custName, Car car) {
		super();
		this.custName = custName;
		this.car = car;
		System.out.println("customer Constructor called");
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		System.out.println("customer setter called");
		this.car = car;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", car=" + car + "]";
	}
	

}
