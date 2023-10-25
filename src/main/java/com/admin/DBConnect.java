package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static final String url = "jdbc:mysql://localhost:3306/grocery";
	private static final String user = "root";
	private static final String pass = "BinuMySQL";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pass);
		}
		catch (Exception e) {
			System.out.println("Database Connection is not Sucessfull!");
		}
		
		return con;
	}
}