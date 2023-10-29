package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;

import online_grocery.DBconnecter;

public class HomepageServiceImpl implements iHomepageService{
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs  = null;
	
	//show items in homePage
	@Override
	public List<Items> getItemDetails() {
		ArrayList<Items> item = new ArrayList<>();
		
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql = "select * from itemnew";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String cat = rs.getString(3);
				String brand = rs.getString(4);
				double price = rs.getDouble(5);
				int qnt = rs.getInt(6);
				String des = rs.getString(8);
				String img = rs.getString(7);
				
				Items it = new Items(id,name,cat,brand,price,qnt,des,img);
				item.add(it);
				
			}

		}
		 catch(Exception e) {
			 
		 }
		return item;
	}
	//show items when click each category
	@Override
	public List<Items> getcatergary(String id) {
		// TODO Auto-generated method stub
		ArrayList<Items> category = new ArrayList<>();
		
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql = "select * from itemnew where Catergary = '"+id+"'";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				String cat = rs.getString(3);
				String brand = rs.getString(4);
				double price = rs.getDouble(5);
				int qnt = rs.getInt(6);
				String des = rs.getString(8);
				String img = rs.getString(7);
				
				System.out.println("service"+cat);
				Items its = new Items(id1,name,cat,brand,price,qnt,des,img);
				category.add(its);	
			}
		}catch(Exception e) {
			
		}
		
		return category;
	}

	
}
