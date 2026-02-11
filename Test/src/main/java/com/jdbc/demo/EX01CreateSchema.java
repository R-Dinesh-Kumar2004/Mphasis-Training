package com.jdbc.demo;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class EX01CreateSchema {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		try {
			int result = employeeDao.createSchema();
			
			if(result == 1) {
				System.out.println("Schema is created successfully.");
			}
			else {
				System.out.println("Schema can't be created");
			}
		}catch (Exception e) {
			System.out.println("OOps something went wrong");
			e.printStackTrace();
		}
	}

}