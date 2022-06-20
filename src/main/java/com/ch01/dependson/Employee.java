package com.ch01.dependson;

public class Employee {
	
	private long id;
	private String name;
	
	private Department department;
	
	public Employee() {
		System.out.println("public Employee() {}");
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
	
	public void setDepartment(Department department) {
		System.out.println("I Actually Won !!!!! ");
		this.department = department;
	}
	
}
