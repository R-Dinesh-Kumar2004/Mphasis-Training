package com.hibernate.many_to_many;

import org.hibernate.Session;

import com.hibernate.utils.HBUtils;

public class GetDemo {

	public static void main(String[] args) {
		Session session = HBUtils.getSessionFactory().openSession();
		
		Trainee t1 = session.get(Trainee.class, 1);
		System.out.println(t1);
	}

}
