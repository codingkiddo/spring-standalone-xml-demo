package com.ch01.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ch01/beans/beans.xml");
//		
//        Department department = ctx.getBean(Department.class);
//        System.out.println(department.getName());
        
        System.out.println("Beans");
        Employee employee = ctx.getBean(Employee.class);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getDepartment().getName());
        
        
        Employee employee1 = ctx.getBean(Employee.class);
        
        if (employee == employee1) {
        	System.out.println("Equals");
        } else {
        	System.out.println("Not Equals");
        }
        
        ExampleBean exampleBean = ctx.getBean(ExampleBean.class);
        System.out.println("Email: " + exampleBean.getEmail());
        
		((ClassPathXmlApplicationContext)ctx).close();
	}
}