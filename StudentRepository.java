package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

// Repository is also a Component, spring can register this also automatically
@Repository
@Scope(value = "session")
public class StudentRepository {
	
	List<Student> students = new ArrayList();
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
}
