package com.ch01.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ch01/dependson/beans.xml");
		System.out.println("Start !!!");
		
//        Employee employee = ctx.getBean(Employee.class);
//        System.out.println(employee.getId());
//        System.out.println(employee.getName());
//        System.out.println(employee.getDepartment().getName());
        
		CommandManager commandManager1 = ctx.getBean(CommandManager.class);
        Command c1 = commandManager1.process();
        
        CommandManager commandManager2 = ctx.getBean(CommandManager.class);
        Command c2 = commandManager2.process();
        
        if (commandManager1 == commandManager2) {
        	System.out.println("CommandManager's Same");
        }
        
        if (c1 == c2) {
        	System.out.println("c1 and c2 are same");
        } else {
        	System.out.println("c1 and c2 are not same");
        }
        
		((ClassPathXmlApplicationContext)ctx).close();
	}
}