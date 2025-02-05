package com.zettamine.spring.ems.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zettamine.spring.ems.dto.Employee;
import com.zettamine.spring.ems.service.EmployeeService;
import com.zettamine.spring.ems.service.EmployeeServiceImpl;

public class EmsManagement {
	public static void main(String[] args) {
		 
		 ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
		 EmployeeService services = context.getBean(EmployeeServiceImpl.class);

		Scanner scan = new Scanner(System.in);
		int opt=0,id;
		String name;
		String dept;
		float sal;
		
		while(opt!=6) {
			System.out.println("1. Add New Employee\n2. Search Employee\n"
					         + "3. Update Employee\n4. Delete Employee\n5. Display All\n6. Exit ");
			System.out.print("Enter a option: ");
			
			opt=scan.nextInt();
			switch(opt) {
			case 1:
				System.out.print("Enter employee id: ");
				id=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter employee name: ");
				name=scan.nextLine();
				System.out.print("Enter employee deptName: ");
				dept=scan.next();
				System.out.print("Enter employee salary: ");
				sal=scan.nextFloat();
				services.saveEmployee(new Employee(id, name, dept, sal));
				break;
			case 2:
				System.out.print("Enter employee id : ");
				id=scan.nextInt();
				services.findById(id);
				break;
			case 3:
				System.out.print("Enter employee id: ");
				id=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter employee name: ");
				name=scan.nextLine();
				System.out.print("Enter employee deptNo: ");
				dept=scan.next();
				System.out.print("Enter employee salary: ");
				sal=scan.nextFloat();
				services.updateEmployee( new Employee(id, name, dept, sal));
				break;
			case 4:
				System.out.print("Enter employee id: ");
				id=scan.nextInt();
				services.deleteEmployee(id);
				break;
			case 5:
				services.getAll();
				break;
			case 6:
				System.out.println("This application was developed by team @ Zettamine");
				break;
			default:
				System.out.println("Invalid option --- try again");
				break;
				
			}
			
		}
		
		((ConfigurableApplicationContext)context).close();
		
		
	}
	



}
