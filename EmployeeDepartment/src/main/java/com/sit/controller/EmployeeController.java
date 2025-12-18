package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.entity.Department;
import com.sit.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	//http://localhost:8080/savedata
	@PostMapping("savedata")
	public String saveDepartment(@RequestBody Department department) {
		service.saveDepartment(department);
		return "Data Saved successfully";
	}
	

}
