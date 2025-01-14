package com.zettamine.spring.ems.service;

import java.util.List;

import com.zettamine.spring.ems.dto.Employee;

public interface EmployeeService {
	void saveEmployee(Employee emp);
	void deleteEmployee(Integer id);
	void updateEmployee(Employee emp);
	void findById(Integer id);
	void getAll();

}
