package com.sit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sit.entity.Student;
import com.sit.respository.StudentRespository;

@Service
public class StudentService {
	@Autowired
	private StudentRespository repository;

	public void saveData(Student student) {
		repository.saveData(student);
		
	}

}
