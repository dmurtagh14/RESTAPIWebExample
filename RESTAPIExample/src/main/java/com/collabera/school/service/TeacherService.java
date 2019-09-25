package com.collabera.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.school.model.Teacher;

@Service
public class TeacherService {
	
	//use a list for polymorphism
	private static List<Teacher> teachers = new ArrayList<>();
	
	private static int idCounter = 1;

}
