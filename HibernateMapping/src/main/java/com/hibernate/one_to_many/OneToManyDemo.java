package com.hibernate.one_to_many;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utils.HBUtils;

public class OneToManyDemo {

	public static void main(String[] args) {
		
		Session session = HBUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setName("Raj");
		Student s2 = new Student();
		s2.setName("Ajay");
		Student s3 = new Student();
		s3.setName("Bala");
		
		List<Student> students = List.of(s1,s2,s3);
		Certificate certificate = new Certificate("NPTEL", students);
		
		s1.setCertificate(certificate);
		s2.setCertificate(certificate);
		s3.setCertificate(certificate);
		
		session.persist(certificate);
		
		transaction.commit();
		session.close();
	}

}
