package com.ch02.beanscope;

public class Customer {
	private Name name;
 
	public Name getName() {
		return name;
	}
 
	public void setName(Name name) {
		this.name = name;
	}
 
	@Override
	public String toString() {
		return "Customer: " + this.getName().getFirstName() + " "
				+ this.getName().getLastName();
	}
}