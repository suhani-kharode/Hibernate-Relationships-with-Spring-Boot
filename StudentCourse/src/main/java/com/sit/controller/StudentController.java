package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.entity.Student;
import com.sit.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	//http://localhost:8080/studentcourse
	
	@PostMapping("studentcourse")
	public String saveData(@RequestBody Student student) {
		service.saveData(student);
		return "Data saved Successfully";
		
	}

}
