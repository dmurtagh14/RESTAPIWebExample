package com.collabera.school.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.school.model.Student;

@Service
public class StudentService {
	//use array list for collecting polymorphism objects
	private static List<Student> students = new ArrayList<>();
	private static int idCounter = 1;
	
	//static BLOCK --> set of code that you want to run
	//on initialization (once student service is created)
	static {
		students.add(new Student(idCounter++, "Jack", 
							"Johnson", LocalDate.of(1998, 5, 22), "Computer Science"));
		
		students.add(new Student(idCounter++, "Marshall", 
				"Matthews", LocalDate.of(1994, 3, 12), "Potions"));
		
		students.add(new Student(idCounter++, "Matthew", 
				"Truelove", LocalDate.of(1998, 5, 22), "Computer Science"));
		
		students.add(new Student(idCounter++, "Lee", 
				"Angioletti", LocalDate.of(1997, 1, 13), "Computer Science"));
		
		students.add(new Student(idCounter++, "Daniel", 
				"Espana", LocalDate.of(1969, 4, 20), "Computer Science"));
		
	}
	
	/*C.R.U.D
	 * Create
	 * Read
	 * Update
	 * Delete
	 */
	
	//Create
	public Student addStudent(String firstName, String lastName, LocalDate dob, String major){
		
		Student student = new Student(idCounter++, firstName, lastName, dob, major);
		//adding student to the array list
		students.add(student);
		return student;
		
	}
	
	//Read --> want to read ALL the students
	public List<Student> getAllStudent(){
		return students;
	}
	
	//Read -->  get individual student
	public Student getStudent(int id) {
		Student student = null; //we have to return a student, but if no student is found we will return a null value
		
		for(int s = 0; s < students.size(); s++) {
			
			if(students.get(s).getId() == id) {
				student = students.get(s);
				break;
			}
		}
		
		return student;
	}
	
	//Read --> get students based on major
	
	public List<Student> getStudentsInMajor(String major){
		List<Student> studentMajor = new ArrayList<>();
		
			for(int s = 0; s < students.size(); s++) {
			
				if(students.get(s).getMajor().toLowerCase().equals(major.toLowerCase())) {
				studentMajor.add(students.get(s));	
				}
			}
		
		return studentMajor;
	}
	
	
	//update
	public void updateStudent(Student student) {
		
		//student may not be the same object, why we are passing along student.getId() as oppose to just Id
		Student studentToUpdate = getStudent(student.getId());
		//first name couldve change (do this for all info)
		studentToUpdate.setFirstName(student.getFirstName());
		studentToUpdate.setLastName(student.getLastName());
		studentToUpdate.setDateOfBirth(student.getDateOfBirth());
		studentToUpdate.setMajor(student.getMajor());
		//NOT DOING THIS FOR ID BECAUSE ID SHOULD NEVER BE UPDATED (Const key)
	}
	
	//Delete 
	
	public void deleteStudent(int id) {
		for(int s = 0; s < students.size(); s++) {
			
			if(students.get(s).getId() == id) {
				//removes the index of the student as opposed to the ID (this is better because if we delete just the id it may cause issues)
				students.remove(students.get(s));
				break;
			}
		}
	}
	
	//Delete all students
	public void removeAllStudents() {
		students.clear();
	}
	

}
