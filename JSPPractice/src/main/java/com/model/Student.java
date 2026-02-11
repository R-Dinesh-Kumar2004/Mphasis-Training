package com.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {
	private String name;
	private long phoneNo;
	private LocalDate admissionDate;
	private String stream[];

	public Student(String name, long phoneNo, LocalDate admissionDate, String stream[]) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.admissionDate = admissionDate;
		this.stream = stream;
	}

	public String getName() {
		return name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public String[] getStream() {
		return stream;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNo=" + phoneNo + ", addmissionDate=" + admissionDate + ", stream="
				+ Arrays.toString(stream) + "]";
	}
}
