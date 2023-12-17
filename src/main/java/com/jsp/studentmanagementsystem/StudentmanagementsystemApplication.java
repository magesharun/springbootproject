package com.jsp.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jsp.studentmanagementsystem.model.Student;
import com.jsp.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}
	
    @Autowired
    private StudentRepository studentrepo;
	@Override
	public void run(String... args) throws Exception 
	{
		Student s1=new Student(1, "magesh","arun","magesharun2016@gmail.com");
		studentrepo.save(s1);
		
		Student s2=new Student(2, "karthik","varun","karthikvarun2016@gmail.com");
		studentrepo.save(s2);
		
		Student s3=new Student(3, "magesh","babu","mageshbabu2016@gmail.com");
		studentrepo.save(s3);
		
		Student s4=new Student(4, "lakshmi","narayanan","lakshminarayanan@gmail.com");
		studentrepo.save(s4);
		
		
	}

}
