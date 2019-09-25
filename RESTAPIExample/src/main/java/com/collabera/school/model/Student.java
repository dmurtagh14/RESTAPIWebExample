package com.collabera.school.model;

import java.time.LocalDate;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String major;

	//default values
	public Student() {
		this(-1, "n/a", "n/a", LocalDate.now(), "n/a");
	}
	//constructor
	public Student(int id, String firstName, String lastName, LocalDate dateOfBirth, String major) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.major = major;
	}
	//getters & setters
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	//toString (good for other people to read)
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", major=" + major + "]";
	}

}
