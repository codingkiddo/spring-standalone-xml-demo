package com.ch01.beans;

public class Employee {

	private long id;
	private String name;
	
	private Department department;
	
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
	}
	
	public Employee(long id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public Employee(Department department) {
		this.department = department;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}

	
}
