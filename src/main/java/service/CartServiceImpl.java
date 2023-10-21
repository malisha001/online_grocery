package service;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import home.cart;
import online_grocery.DBconnecter;
import model.*;

public class CartServiceImpl implements iCartService{
	
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs  = null;
	@Override
	public boolean getItems(int itemId, int quentity, String userID) {
		// TODO Auto-generated method stub
		boolean isSucces = false;
		String ItemName = "";
		int Tprice = 0;
		int price = 0;
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
	        // Select the item's details
	        String sql = "SELECT itemName, price FROM item WHERE itemID = " + itemId;
	        rs = st.executeQuery(sql);
			
			if(rs.next()) {

				ItemName = rs.getString("itemName");
				price = rs.getInt("price");
					
			}
			System.out.println(Tprice);
			Tprice = price*quentity;
			String username = userID;
			int Quentity = quentity;
			
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql1 = "insert into cart values(0,'"+userID+"','"+ItemName+"','"+Quentity+"','"+Tprice+"')";
			int rs1 = st.executeUpdate(sql1);
			
			if(rs1>0) {
				isSucces = true;
			}
			else {
				isSucces = false;
			}

		}
		catch(Exception e) {
			
		}
		
		return isSucces;
	}

	@Override
	public List<Cart> getCartDetails(String username) {
		// TODO Auto-generated method stub
		ArrayList<Cart> cartItems = new ArrayList<>();
		System.out.println("cart DB:"+username);
		
		String itemss = null;
		int quentity = 0;
		int price = 0;
		int ID = 0;
		
		
		
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql2 = "select * from cart where userId = '"+username+"'";
			
			rs = st.executeQuery(sql2);
			
			while(rs.next()) {
				
				itemss = rs.getString("itemName");
				quentity = rs.getInt("quentity");
				price = rs.getInt("price");
				ID  = rs.getInt("id");
				
				Cart ca  = new Cart(itemss, quentity,price,ID);
				cartItems.add(ca);
			}	
		}
		catch(Exception e) {
			
		}
		return cartItems;
		
	}

	@Override
	public void deleteItems(int id) {
		// TODO Auto-generated method stub
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql3 = "DELETE FROM cart WHERE id = '"+id+"'";
			int rs3 = st.executeUpdate(sql3);
			
		}
		catch(Exception e) {
			
		}
		
	}

	@Override
	public void updateItems(int id, int qnt) {
		// TODO Auto-generated method stub
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql4 = "UPDATE cart SET quentity = '"+qnt+"' where id= '"+id+"'";
			int rs4 = st.executeUpdate(sql4);
		}
		catch(Exception e) {
			
		}
		
	}

}
