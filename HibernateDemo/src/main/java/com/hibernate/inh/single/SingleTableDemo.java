package com.hibernate.inh.single;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utils.HBUtils;

public class SingleTableDemo {

	public static void main(String[] args) {
		Employee101 employee = new Employee101("Yash");
		RegularEmployee regularEmployee = new RegularEmployee("Gowtham", 30000, 1000);
		ContractEmployee contractEmployee = new ContractEmployee("Kastubh", 500, "3 months");
		
		Session session = HBUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(employee);
		session.persist(regularEmployee);
		session.persist(contractEmployee);
		
		transaction.commit();
		session.close();
	}

}
