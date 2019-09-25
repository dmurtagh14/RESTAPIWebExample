package com.collabera.school.model;

import java.time.LocalDate;

public class Teacher {

	private int id;
	private String firstName;
	private String lastName;
	private String subject;
	private LocalDate dob;
	
	
	//constructor
	public Teacher(int id, String firstName, String lastName, String subject, LocalDate dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
		this.dob = dob;
	}
	
	//default values 
	
	public Teacher() {
		this(-1, "n/a", "n/a", "n/a", LocalDate.now());
	}
	
	
	
	//generate getters & setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
