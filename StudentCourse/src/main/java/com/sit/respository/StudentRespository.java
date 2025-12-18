package com.sit.respository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sit.entity.Student;

@Repository
public class StudentRespository {
	
	@Autowired
	SessionFactory factory;

	public void saveData(Student student) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(student);
		
		 tx.commit();
	     session.close();
		
	}

}
