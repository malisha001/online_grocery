package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Items;
import online_grocery.DBconnecter;


public class AdminServiceImpl implements iAdminService{
	private static Connection con1 = null;
	private static Statement stmt1 = null;
	private static ResultSet resultSet = null;
	
	//add product method
	@Override
	public boolean addproduct(String Name,String Category,String Brand,String UnitPrice,String Quantity,String img,String Description ) {
		
		System.out.println("add to items:"+Name);
		boolean isSuccess = false;
		try {
			con1 = DBconnecter.getConnection();
			stmt1 = con1.createStatement();
			String sql = "insert into itemnew(ID,Name,Catergary,Brand,UnitPrice,Quantity,img,Description) VALUES (0,'"+Name+"','"+Category+"','"+Brand+"','"+UnitPrice+"','"+Quantity+"','"+img+"','"+Description+"')";
			int rs = stmt1.executeUpdate(sql);
			
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
		
		System.out.println("admin service:"+id);
		System.out.println("admin service:"+name);
		System.out.println("admin service:"+cat);
		System.out.println("admin service:"+brand);
		boolean isSuccess = false;
		int idd = Integer.parseInt(id);
    	
    	try {
    		
    		con1 = DBconnecter.getConnection();
            stmt1 = con1.createStatement();
            String sql = "update itemnew set Name='"+name+"',Catergary= '"+cat+"', Brand= '"+brand+"', UnitPrice='"+price+"', Quantity='"+qty+"',Description='"+dis+"' where ID = '"+idd+"'";
            System.out.println(name);
            int rs = stmt1.executeUpdate(sql);
            System.out.println("admin service:"+name);
            System.out.println(rs);
            
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

	//delete items details method
	@Override
	public boolean deleteProducts(String id) {
		
		boolean isSuccess = false;
    	
    	int convId = Integer.parseInt(id);
    	System.out.print("implementation:"+convId);
    	try {
    		con1 = DBconnecter.getConnection();
            stmt1 = con1.createStatement();
            String sql ="delete from itemnew where id = '"+convId+"'";
            int r = stmt1.executeUpdate(sql);
            
            
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
    		con1 = DBconnecter.getConnection();
            stmt1 = con1.createStatement();
            String sql = "Select * From itemnew";
            resultSet = stmt1.executeQuery(sql);
            
            while(resultSet.next()) {
            	int ID = resultSet.getInt(1);
                String Name = resultSet.getString(2);
                String Category = resultSet.getString(3);
                String Brand = resultSet.getString(4);
                double UnitPrice = resultSet.getDouble(5);
                int Quantity = resultSet.getInt(6);
                String Description = resultSet.getString(8);
                String img = resultSet.getString(7);
                
                
                Items i = new Items(ID, Name, Category, Brand, UnitPrice, Quantity, Description,img);
                item.add(i);
            			
            }
           
    	}
    	catch(Exception e){
    		e.printStackTrace();

    	}
    	
    	
    	return item;
	}

}
