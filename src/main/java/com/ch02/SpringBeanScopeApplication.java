package com.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ch02.beanscope.Customer;
import com.ch02.beanscope.Name;

public class SpringBeanScopeApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ch02/beans.xml");
 
		//Bean customer1
		Customer customer1_1 = (Customer) context.getBean("customer1_1");
		System.out.println(customer1_1);
		
		Name name1 = (Name) context.getBean("name1");
		name1.setFirstName("Peter");
		name1.setLastName("Pan");
		
		Customer customer1_2 = (Customer) context.getBean("customer1_2");
		System.out.println(customer1_2);
 
		//Bean customer2
		Customer customer2_1 = (Customer) context.getBean("customer2_1");
		System.out.println(customer2_1);
		
		Name name2 = (Name) context.getBean("name2");
		name2.setFirstName("Peter");
		name2.setLastName("Pan");
		
		Customer customer2_2 = (Customer) context.getBean("customer2_2");
		System.out.println(customer2_2);
	}
	
}
