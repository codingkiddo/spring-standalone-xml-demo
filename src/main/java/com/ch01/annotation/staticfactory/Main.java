package com.ch01.annotation.staticfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ch01/annotation/staticfactory/beans.xml");

        
        
        ClientService clientService = ctx.getBean(ClientService.class);
        
        if (clientService == null) {
        	System.out.println("Null");
        } else {
        	System.out.println(clientService.getClass());
        }
        
		((ClassPathXmlApplicationContext)ctx).close();
	}
}