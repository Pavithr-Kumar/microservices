package com.zettamine.spring.ems.service;

import java.util.List;

import com.zettamine.spring.ems.dao.EmployeeDao;
import com.zettamine.spring.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao;
	public EmployeeServiceImpl(EmployeeDao empDao) {
		
		this.empDao = empDao;
	}

	@Override
	public void saveEmployee(Employee emp) {
		int n = empDao.insertEmployee(emp);
		if(n>0)
			System.out.println("Employee Saved");
		else
			System.err.println("Employee not saved");
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		int n = empDao.deleteEMployee(id);
		if(n>0)
			System.out.println("Employee Deleted");
		else
			System.err.println("Employee not saved");
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		int n = empDao.updateEmployee(emp);
		if(n>0)
			System.out.println("Employee Updated");
		else
			System.err.println("Employee not saved");
		
		
	}

	@Override
	public void findById(Integer id) {
		System.out.println(empDao.findById(id));
		
	}

	@Override
	public void getAll() {
	   empDao.getAll().stream().forEach(System.out::println);
	}

}
