package com.model;

public class Student {
	private String name;
	private int age;
	private String gender;
	private String[] skills;
	private String city;

	public Student(String name, int age, String gender, String[] skills, String city) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.skills = skills;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String[] getSkills() {
		return skills;
	}

	public String getCity() {
		return city;
	}

}
