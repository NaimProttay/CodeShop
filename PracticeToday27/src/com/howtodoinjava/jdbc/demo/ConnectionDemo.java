package com.howtodoinjava.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] args) {
		System.out.println("-------MySQL JDBC Connection Demo-----");
		
		try {
			Class.forName("com.mysql.jdbc.driver"); //implements the java.sql.Driver
		}
		
		catch(ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found");
		}
		
		System.out.println("MySQL JDBC Driver Registered");
		Connection connection=null;
		
		try {
			connection=DriverManager      /*obtain a connection instance that is connected to a particular database
			or open database connection*/
					.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "password");
			System.out.println("SQL Connection to database estabilished!");
		}
		
		catch(SQLException e) {
			System.out.println("Connection Failed! Check output console");
			return;
		}
		finally
		{
			try {
				if (connection!=null)
					connection.close();
				System.out.println("connection Closed !"); //Close database connection
			}
			
			catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
