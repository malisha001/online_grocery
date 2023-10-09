package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean addproduct(String Name,String Category,String Brand,String UnitPrice,String Quantity,String Description ) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
//			stmt = con.createStatement();
			
//			String sql ="insert into items values(0,'"+Name+"','"+Category+"','"+Brand+"','"+UnitPrice+"','"+Quantity+"','"+Description+"')";
			String sql ="insert into items values(?,?,?,?,?,?,?)";
			PreparedStatement pre =con.prepareStatement(sql);
			pre.setObject(1, 0);
			pre.setObject(2, Name);
			pre.setObject(3, Category);
			pre.setObject(4, Brand);
			pre.setObject(5, UnitPrice);
			pre.setObject(6, Quantity);
			pre.setObject(7, Description);
			
			return pre.executeUpdate()>0;
			
			
			

////			int rs = stmt.executeUpdate(sql);
//			
//			if(rs>0) {
//				isSuccess = true;
//			}else {
//				isSuccess = false;
//			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
}