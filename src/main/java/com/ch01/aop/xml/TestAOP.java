package com.ch01.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ch01/aop/xml/beans.xml");
		EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");

		manager.getEmployeeById(1);

		manager.createEmployee(new EmployeeDTO());

		manager.deleteEmployee(100);
		
		( (ClassPathXmlApplicationContext) context).close();
	}
}
