package com.ch03.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ch03/beans.xml");
		Employee employee = (Employee) (ctx.getBean(Employee.class));
		System.out.println(employee.getEmpName());
//      DemoBeanAware demoBeanAware = (DemoBeanAware) (ctx.getBean(DemoBeanAware.class));
        
		((ClassPathXmlApplicationContext)ctx).close();
	}
}