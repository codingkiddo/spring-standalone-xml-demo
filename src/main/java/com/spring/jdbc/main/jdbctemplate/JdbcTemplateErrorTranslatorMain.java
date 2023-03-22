package com.spring.jdbc.main.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateErrorTranslatorMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/spring/jdbc/H2-DB-datasource-context.xml");

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		
		jdbcTemplate.setExceptionTranslator(new CustomSQLErrorCodeTranslator());
		
		int count = jdbcTemplate.queryForObject("select count(* from spitter", Integer.class);
		System.out.println("COUNT: " + count);
		System.out.println();

		((ClassPathXmlApplicationContext) context).close();

	}

}
