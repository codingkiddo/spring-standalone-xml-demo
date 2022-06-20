package com.spring.chapter01.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/chapter01/ex1/beans.xml");

		Student s = (Student) ctx.getBean("student1");
        
        System.out.println("Id : "+ s.getId());
        System.out.println("Name : "+ s.getName());
        System.out.println("Age :"+ s.getAge());
        
		((ClassPathXmlApplicationContext)ctx).close();
	}
}