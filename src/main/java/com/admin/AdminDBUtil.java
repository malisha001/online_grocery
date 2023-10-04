package com.admin;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	public static List<Admin> validate(String name, String Email, String password ){
		
		ArrayList<Admin> admin = new ArrayList<>();
		
		//validate
		
		try {
			
			String sql = "select * from admin where Name = '"+name+"' and Password='"+password+"'";
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
		catch(Exeption e){
			e.printStackTrace();
			
		}
		return admin;
	}

}
