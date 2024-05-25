package com.student.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	 List<Student> findByName(String name);
	    List<Student> findByClassName(String className);

}
