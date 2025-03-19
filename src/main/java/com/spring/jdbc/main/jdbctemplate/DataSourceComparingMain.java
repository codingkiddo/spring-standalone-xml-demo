package com.spring.jdbc.main.jdbctemplate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.h2.Driver;
import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class DataSourceComparingMain {

	public static void main(String[] args) throws SQLException {
		
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource(Driver.load(), 
				"jdbc:h2:mem:AZ;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;INIT=runscript "
				+ "from 'classpath:com/spring/jdbc/schema.sql'\\;runscript from 'classpath:com/spring/jdbc/test-data.sql'");
		Connection c1 = dataSource.getConnection();
		Statement stmt = c1.createStatement();
		ResultSet rs = stmt.executeQuery("select * from spitter");
		while( rs.next() ) {
			System.out.println(rs.getString("username"));
		}
		System.out.println();
		
		
		JdbcDataSource jdbcDataSource = new JdbcDataSource();
		jdbcDataSource.setURL("jdbc:h2:mem:AZ;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;INIT=runscript "
				+ "from 'classpath:com/spring/jdbc/schema.sql'\\;runscript from 'classpath:com/spring/jdbc/test-data.sql'");
		Connection c2 = dataSource.getConnection();
		Statement stmt2 = c2.createStatement();
		ResultSet rs2 = stmt2.executeQuery("select * from spitter");
		while( rs2.next() ) {
			System.out.println(rs2.getString("username"));
		}
		System.out.println();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/spring/jdbc/H2-DB-datasource-context.xml");
		
		DataSource ds = context.getBean(DataSource.class);
		Connection c3 = ds.getConnection();
		Statement stmt3 = c3.createStatement();
		ResultSet rs3 = stmt3.executeQuery("select * from spitter");
		while( rs3.next() ) {
			System.out.println(rs3.getString("username"));
		}
		System.out.println();
		
		
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		int count = jdbcTemplate.queryForObject("select count(*) from spitter", Integer.class);
		System.out.println("COUNT: " + count);
		System.out.println();
		
		( (ClassPathXmlApplicationContext) context).close();
		
	}

}
