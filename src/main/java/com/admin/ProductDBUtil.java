package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet resultSet = null;
	
	private static Connection con1 = null;
	private static Statement stmt1 = null;
	private static ResultSet resultSet1 = null;
	
	public static boolean addproduct(String Name,String Category,String Brand,double UnitPrice,int Quantity,String Description ) {
		boolean isSuccess = false;

		
		try {
		    con1 = DBConnect.getConnection();
		    stmt1 = con1.createStatement();            
		    String sql1 = "INSERT INTO items (Name) VALUES ('" + Name + "')";
		    System.out.println(Name);
		    System.out.println(Category);
		    System.out.println(Brand);
		    System.out.println(UnitPrice);
		    System.out.println(Quantity);
		    System.out.println(Description);
   
		    int resultSet1 = stmt1.executeUpdate(sql1);
			
			
			System.out.println("yy " + resultSet1);
			if(resultSet1>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
	 
	    public static boolean deleteProducts(int ID) {
	    	boolean isSuccess = false;
	    	
	    	try {
	    		con = DBConnect.getConnection();
	            stmt = con.createStatement();
	            String Sql = "SELECT * FROM items WHERE ID ='"+ID+"' ";
	            int resultSet = stmt.executeUpdate(Sql);
	             
	            if(resultSet>0) {
	            	isSuccess =true;
	            }
	            else {
	            	isSuccess = false;
	            }
	    		
	    	}
	    	catch(Exception e) {
	    		 e.printStackTrace();
		         throw new RuntimeException("Failed to delete items from the database.");
	    	}
	    
	    	return isSuccess;
	    }
	    
	    
	    
	    
	    public static boolean updateProducts(String id,String name, String cat, String brand, String price, String qty, String dis ) {
	    	boolean isSuccess = false;
	    	
	    	try {
	    		System.out.println(name);
	    		con = DBConnect.getConnection();
	            stmt = con.createStatement();
	            String sql = "update items set Name='"+name+"', Category= '"+cat+"', Brand= '"+brand+"', UnitPrice='"+price+"', Quantity='"+qty+"',Description='"+dis+"' where id = '"+id+"'";
	            
	            int rs = stmt.executeUpdate(sql);
	            
	            if(rs>0) {
	            	isSuccess =true;
	            }
	            else {
	            	isSuccess = false;
	            }
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    	
	    }
	    
	    
	    
	    
	    public static List<Items> getItemDetails(String id){
	    	
	    	int convertedID  = Integer.parseInt(id);
	    	
	    	ArrayList<Items> item = new ArrayList<>();
	    	
	    	try {
	    		con = DBConnect.getConnection();
	            stmt = con.createStatement();
	            String sql = "Select * From items Where id = '"+convertedID+"'";
	            resultSet = stmt.executeQuery(sql);
	            
	            while(resultSet.next()) {
	            	int ID = resultSet.getInt(1);
	                String Name = resultSet.getString(2);
	                String Category = resultSet.getString(3);
	                String Brand = resultSet.getString(4);
	                double UnitPrice = resultSet.getDouble(5);
	                int Quantity = resultSet.getInt(6);
	                String Description = resultSet.getString(7);
	                
	                Items i = new Items(ID, Name, Category, Brand, UnitPrice, Quantity, Description);
	                item.add(i);
	            			
	            }
	            
	    	}
	    	catch(Exception e){
	    		e.printStackTrace();

	    	}
	    	
	    	
	    	return item;
	    }
	    
	    
	    public static boolean deleteProducts(String id) {
	    	boolean isSuccess = false;
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		con = DBConnect.getConnection();
	            stmt = con.createStatement();
	            String sql ="delete from Items where id = '"+convId+"'";
	            int r = stmt.executeUpdate(sql);
	            
	            
	            if(r>0) {
	            	isSuccess =true;
	            }
	            else {
	            	isSuccess = false;
	            }
	            
	            
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    	
	    }
	    
	    public static List<Items> getAllItemDetails(){
	    		    	
	    	ArrayList<Items> item = new ArrayList<>();

	    	try {
	    		con = DBConnect.getConnection();
	            stmt = con.createStatement();
	            String sql = "Select * From items";
	            resultSet = stmt.executeQuery(sql);
	            
	            while(resultSet.next()) {
	            	int ID = resultSet.getInt(1);
	                String Name = resultSet.getString(2);
	                String Category = resultSet.getString(3);
	                String Brand = resultSet.getString(4);
	                double UnitPrice = resultSet.getDouble(5);
	                int Quantity = resultSet.getInt(6);
	                String Description = resultSet.getString(7);
	                
	                Items i = new Items(ID, Name, Category, Brand, UnitPrice, Quantity, Description);
	                item.add(i);
	            			
	            }
	           
	    	}
	    	catch(Exception e){
	    		e.printStackTrace();

	    	}
	    	
	    	
	    	return item;
	    }
}

