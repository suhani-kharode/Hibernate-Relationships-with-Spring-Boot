package com.sit.respository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sit.entity.Department;
@Repository
public class EmployeeRespository {
	@Autowired
	private SessionFactory factory;

	public void saveDepartment(Department department) {
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(department);
		
        tx.commit();
        session.close();
	
	}

}
