package com.appspot.wsventanaeducativa.dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	
	
	private static Connection connection = null;
	
	public static synchronized Connection getConnection() throws SQLException {
		System.out.println("-------- MySQL JDBC Connection Testing ------------");
		
		if (connection != null){
			if ( !connection.isClosed()){
				return connection;
			}
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return null;
		}
	 		
		try {
			connection = DriverManager
			.getConnection("jdbc:mysql://172.16.107.157:3306/vema","vema", "vema");
	 
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;
		}
	 
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		return connection;
	}

}
