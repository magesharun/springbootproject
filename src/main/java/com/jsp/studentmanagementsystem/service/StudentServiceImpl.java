package com.jsp.studentmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.studentmanagementsystem.model.Student;
import com.jsp.studentmanagementsystem.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService
{
	private StudentRepository studentRepo;

	public StudentServiceImpl(StudentRepository studentRepo) {
		
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
		
	}

}
