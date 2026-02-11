package com.dao;

import java.sql.SQLException;

import com.model.Employee;

public interface EmployeeDao {
	
	int createSchema() throws SQLException;

	int createTable() throws SQLException;

	int insertEmployee(Employee employee) throws SQLException;
}