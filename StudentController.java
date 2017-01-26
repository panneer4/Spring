package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "students")
@Scope(value = "session")
public class StudentController {
	
	StudentRepository repository;
	
	@Autowired
	public StudentController(StudentRepository repository) {
		this.repository = repository;
	}
		
	@GetMapping
	public @ResponseBody List<Student> getStudents() {
		return repository.getStudents();  // view name
	}
	
	@PostMapping
	public @ResponseBody List<Student> addStudent(@ModelAttribute("SpringWeb")Student student) {
		repository.addStudent(student);
		return repository.getStudents(); 
	}
}
