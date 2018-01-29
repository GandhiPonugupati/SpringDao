package com.demo;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Application {

	public static void main(String[] args) throws SQLException {

		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		DriverManagerDataSource ds = (DriverManagerDataSource) ctx.getBean("bds");
		Connection con = ds.getConnection();
		System.out.println(con);
	}

}
