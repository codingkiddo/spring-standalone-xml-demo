package com.spring.jdbc.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/spring/jdbc/JdbcRepositoryTests-context.xml");
		
		
		
		( (ClassPathXmlApplicationContext) context).close();
		
	}

}
