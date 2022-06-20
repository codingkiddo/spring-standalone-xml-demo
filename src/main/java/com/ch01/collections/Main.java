package com.ch01.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ch01/collections/beans.xml");

		ComplexObject complexObject = ctx.getBean(ComplexObject.class);
        
		System.out.println(complexObject.getAdminEmails().values());
		System.out.println(complexObject.getSomeList());
		System.out.println(complexObject.getSomeMap());
		System.out.println(complexObject.getSomeSet());
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
}