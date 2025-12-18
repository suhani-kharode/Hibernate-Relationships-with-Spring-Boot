package com.sit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.entity.Department;
import com.sit.respository.EmployeeRespository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRespository respository;

	public void saveDepartment(Department department) {
		 respository.saveDepartment(department);
		
	}

}
