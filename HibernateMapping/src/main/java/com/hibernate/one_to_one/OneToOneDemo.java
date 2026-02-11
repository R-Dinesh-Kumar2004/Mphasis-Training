package com.hibernate.one_to_one;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utils.HBUtils;

public class OneToOneDemo {

	public static void main(String[] args) {
		
		Session session = HBUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		

		Laptop laptop = new Laptop("HP","RESS12J");
		Employee employee = new Employee("Jai", laptop);
		
		session.persist(employee);
		
		transaction.commit();
		session.close();
	}

}
