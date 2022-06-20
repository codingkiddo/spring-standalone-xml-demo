package com.ch01.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private long id;
	private String name;
	
	private Department department;
	
	public Employee() {
	}
	
	@Autowired(required=false)
	Employee(Department department, long id, String name) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	@Autowired(required=false)
	Employee(Department department) {
		System.out.println("I Won !!!!! ");
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
	
//	@Autowired
	@Autowired(required=false)
	public void setDepartment(Department department) {
		System.out.println("I Actually Won !!!!! ");
		this.department = department;
	}
	
}
