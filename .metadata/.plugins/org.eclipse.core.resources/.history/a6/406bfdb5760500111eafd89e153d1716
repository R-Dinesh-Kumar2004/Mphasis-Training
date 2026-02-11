package com.hibernate.one_to_one;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;

	public Employee() {
		super();
	}

	public Employee(String name, Laptop laptop) {
		super();
		this.name = name;
		this.laptop = laptop;
	}

	public Employee(int id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}

}
