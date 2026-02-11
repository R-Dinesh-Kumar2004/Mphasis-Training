package com.hibernate.HibernateAssignment;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.entities.Admin;
import com.hibernate.utils.HBUtils;

public class FetchAdminDemo {

	public static void main(String[] args) {
		
		Session session = HBUtils.getSessionFactory().openSession();
		
		List<Admin> admins = session.createQuery("from Admin",Admin.class).getResultList();
		
		for(Admin admin : admins) {
			System.out.println(admin);
		}
	}

}
