package com.sit.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.entity.Student;
import com.sit.respository.RespositorySA;

@Service
public class ServiceSA {
	@Autowired
	private RespositorySA respository;

	public void createStudent(Student s) {
		 respository.createStudent(s);	
	}

	public Student getData(String id) {
		int objId=Integer.parseInt(id);
		Student stu=respository.getData(objId);
		return stu;
	}

	

}
