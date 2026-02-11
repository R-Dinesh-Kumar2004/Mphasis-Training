package com.hibernate.HibernateDemo;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entities.Employee;
import com.hibernate.utils.HBUtils;

public class Ex05UpdateEmployee {
    public static void main( String[] args )
    {
        Session session = HBUtils.getSessionFactory().openSession();
        
        Transaction transaction = session.beginTransaction();
        
		Employee employee = session.get(Employee.class, 3);
		employee.setName("Bheaem");
		employee.getAddress().setCity("Chennai");
        
        transaction.commit();
        session.close();
    }
}