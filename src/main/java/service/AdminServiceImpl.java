package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.DBConnect;
import com.admin.Items;

public class AdminServiceImpl implements iAdminService{
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet resultSet = null;
	
	//add product method
	@Override
	public boolean addproduct(String Name, String Category, String Brand, double UnitPrice, int Quantity,
			String Description) {
		boolean isSuccess = false;
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into items(ID,Name,Category,Brand,UnitPrice,Quantity,Description) VALUES (','"+Name+"','"+Category+"','"+Brand+"','"+UnitPrice+"','"+Quantity+"','"+Description+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	return isSuccess;
	}
	
	//update product details method
	@Override
	public boolean updateProducts(String id, String name, String cat, String brand, String price, String qty,
			String dis) {
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
	//show items details method
	@Override
	public List<Items> getItemDetails(String id) {
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
	//delete items details method
	@Override
	public boolean deleteProducts(String id) {
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
	//get all items details method
	@Override
	public List<Items> getAllItemDetails() {
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
