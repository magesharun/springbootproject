package com.jsp.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.studentmanagementsystem.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>
{
	

}
