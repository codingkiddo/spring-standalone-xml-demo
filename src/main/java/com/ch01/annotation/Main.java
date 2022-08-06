package com.ch01.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ch01/beans.xml");
//		
//        Department department = ctx.getBean(Department.class);
//        System.out.println(department.getName());
        
        System.out.println("Const");
        Employee employee = ctx.getBean(Employee.class);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getDepartment().getName());
        
      
		((ClassPathXmlApplicationContext)ctx).close();
	}
}