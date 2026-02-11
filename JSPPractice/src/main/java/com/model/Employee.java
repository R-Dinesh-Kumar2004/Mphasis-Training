package com.model;

import java.time.LocalDate;


public class Employee {
	private int id;
	private String name;
	private String department;
	private LocalDate dayeOfJoining;
	private int monthlySalary;
	private int totalWorkingDays;
	private int presentDays;
	public Employee(int id, String name, String department, LocalDate dayeOfJoining, int monthlySalary,
			int totalWorkingDays, int presentDays) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dayeOfJoining = dayeOfJoining;
		this.monthlySalary = monthlySalary;
		this.totalWorkingDays = totalWorkingDays;
		this.presentDays = presentDays;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public LocalDate getDayeOfJoining() {
		return dayeOfJoining;
	}
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}
	public int getPresentDays() {
		return presentDays;
	}
	
	public double getAttendancePercentage() {
		return (presentDays*100.0)/totalWorkingDays;
	}
	
	public double getSalaryPayable() {
		return ((double)monthlySalary*presentDays)/totalWorkingDays;
	}
	
	public char getAttendanceGrade() {
		double percentage = getAttendancePercentage();
		
		if(percentage >= 90) return 'A';
		else if(percentage >= 75) return 'B';
		return 'C';
	}
}
