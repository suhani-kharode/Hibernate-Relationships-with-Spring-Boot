package com.sit.respository;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sit.entity.Student;
@Repository
public class RespositorySA {
	@Autowired
	private SessionFactory factory;

	public void createStudent(Student s) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		      
		       
	}

	public Student getData(int objId) {
		Session session = factory.openSession();
	Student stu=session.get(Student.class,objId);
		return stu;
	}

	

}
