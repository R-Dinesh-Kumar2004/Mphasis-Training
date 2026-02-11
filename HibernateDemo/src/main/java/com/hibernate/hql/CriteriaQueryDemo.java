package com.hibernate.hql;

import org.hibernate.Session;

public class CriteriaQueryDemo {

	public static void main(String[] args) {
		Session session = HBUtils.getSessionFactory().openSession();
		
		
		
		session.close();
	}

}
