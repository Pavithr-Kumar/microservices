package com.zettamine.data;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zettamine.data.entities.Course;
import com.zettamine.data.entities.Student;
import com.zettamine.data.repository.CourseRepo;
import com.zettamine.data.repository.StudentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private  StudentRepo sRepo;
	@Autowired
	private  CourseRepo cRepo;

	public static void main(String[] args)  {
		SpringApplication.run(Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course();
		c1.setCDesc("React JS");
		Course c2 = new Course();
		c2.setCDesc("Spring Boot");
	//Student s1 = new Student("Ravi",c1);
		
		Student s1 = new Student();
		s1.setName("Gowri Shankar");
		s1.setCourse(Arrays.asList(c1));
	    c1.setStudent(Arrays.asList(s1));
	sRepo.save(s1);
	
	}

}
