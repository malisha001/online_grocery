package com.admin;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	private static boolean isSucess = false;
	
	public static boolean validate(String name, String Email, String password ){
			
		//validate
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "select * from admin where Name = '"+name+"' and Email = '"+Email+"' and Password='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSucess = true;				
			}
			else {
				isSucess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return isSucess;
	}

}
