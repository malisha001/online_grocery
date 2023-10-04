package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	public static List<Admin> validate(String name, String Email, String password ){
		
		ArrayList<Admin> admin = new ArrayList<>();
		
		//validate
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt =con.createStatement();
			String sql = "select * from admin where Name = '"+name+"' and Email = '"+Email+"' and Password='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String nameA = rs.getString(2);
				String email = rs.getString(3);
				String passwordA = rs.getString(4);
				
				Admin a = new Admin(id,nameA,email,passwordA);
				admin.add(a);
				
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return admin;
	}

}
