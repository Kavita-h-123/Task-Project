package com.student.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.demo.entity.Student;
import com.student.demo.exception.ResourceNotFoundException;
import com.student.demo.repository.StudentRepository;

public class StudentService {
	 @Autowired
	    private StudentRepository studentRepository;

	    public Student addStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public Optional<Student> getStudentById(Long id) {
	        return studentRepository.findById(id);
	    }

	    public List<Student> getStudentsByName(String name) {
	        return studentRepository.findByName(name);
	    }

	    public List<Student> getStudentsByClassName(String className) {
	        return studentRepository.findByClassName(className);
	    }

	    public Student updateStudent(Long id, Student studentDetails) {
	        Student student = studentRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + id));

	        student.setName(studentDetails.getName());
	        student.setDateOfBirth(studentDetails.getDateOfBirth());
	        student.setJoiningDate(studentDetails.getJoiningDate());
	        student.setClassName(studentDetails.getClassName());

	        return studentRepository.save(student);
	    }
	    
	    public void deleteStudent(Long id) {
	    	
	    	studentRepository.deleteById(id);
	    }
	}


