package com.capgemini.spring_rest_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.spring_rest_demo.exception.StudentNotFoundException;
import com.capgemini.spring_rest_demo.model.Student;
import com.capgemini.spring_rest_demo.repository.StudentRepository;

@Service
public class StudentService {
	
	public StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found with id: "+id));
	}
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Long id, Student student) {
		
		Student existingStudent = studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found with id: "+id));
		existingStudent.setName(student.getName());
		existingStudent.setCity(student.getCity());
		return studentRepository.save(existingStudent);
	}
	
	public void deleteStudent(Long id) {
		Student existingStudent = studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found with id: "+id));
		studentRepository.delete(existingStudent);
	}

}
