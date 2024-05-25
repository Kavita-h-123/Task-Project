package com.student.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



public class Student {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;

	    @Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", joiningDate="
					+ joiningDate + ", className=" + className + "]";
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(Long id, String name, LocalDate dateOfBirth, LocalDate joiningDate, String className) {
			super();
			this.id = id;
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.joiningDate = joiningDate;
			this.className = className;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public LocalDate getJoiningDate() {
			return joiningDate;
		}

		public void setJoiningDate(LocalDate joiningDate) {
			this.joiningDate = joiningDate;
		}

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		@Column(name = "date_of_birth", nullable = false)
	    private LocalDate dateOfBirth;

	    @Column(name = "joining_date", nullable = false)
	    private LocalDate joiningDate;

	    @Column(nullable = false)
	    private String className;

	    // Getters and setters
	    // ...
	}


