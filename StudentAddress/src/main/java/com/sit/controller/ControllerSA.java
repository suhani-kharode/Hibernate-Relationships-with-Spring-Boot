package com.sit.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sit.entity.Student;

import com.sit.service.ServiceSA;
@RestController
public class ControllerSA {
	@Autowired
	private ServiceSA service;
	
//http://localhost:8080/create
	@PostMapping("create")
	public String createStudent(@RequestBody Student s) {
		 service.createStudent(s);
		 return "Data added ";
		}
	
//http://localhost:8080/getdata?id=
	@GetMapping("getdata")
	public Student getData(@RequestParam(name="id") String id){
		Student stu=service.getData(id);
		return stu;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
