package home;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import online_grocery.DBconnecter;

public class CartDB {
	
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs  = null;
	
	private static Connection con1 = null;
	private static Statement st1 = null;
	private static ResultSet rs1  = null;
	
	private static Connection con2 = null;
	private static Statement st2 = null;
	private static ResultSet rs2 = null;
	
	private static Connection con3 = null;
	private static Statement st3 = null;
	private static ResultSet rs3 = null;
	
	private static Connection con4 = null;
	private static Statement st4 = null;
	private static ResultSet rs4 = null;
	
	public static boolean getItems(int itemsId, int quentity, String userID){
		
		boolean isSucces = false;
		String ItemName = "";
		int Tprice = 0;
		int price = 0;
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
	        // Select the item's details
	        String sql = "SELECT itemName, price FROM item WHERE itemID = " + itemsId;
	        rs = st.executeQuery(sql);
			
			if(rs.next()) {

				ItemName = rs.getString("itemName");
				price = rs.getInt("price");
					
			}
			System.out.println(Tprice);
			Tprice = price*quentity;
			String username = userID;
			int Quentity = quentity;
			
			con1 = DBconnecter.getConnection();
			st1 = con1.createStatement();
			String sql1 = "insert into cart values(0,'"+userID+"','"+ItemName+"','"+Quentity+"','"+Tprice+"')";
			int rs1 = st1.executeUpdate(sql1);
			
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
	public static List<cart> getCartDetails(String username){
		
		ArrayList<cart> cartItems = new ArrayList<>();
		System.out.println("cart DB:"+username);
		
		String itemss = null;
		int quentity = 0;
		int price = 0;
		int ID = 0;
		
		
		
		try {
			con2 = DBconnecter.getConnection();
			st2 = con2.createStatement();
			String sql2 = "select * from cart where userId = '"+username+"'";
			
			rs2 = st2.executeQuery(sql2);
			
			while(rs2.next()) {
				
				itemss = rs2.getString("itemName");
				quentity = rs2.getInt("quentity");
				price = rs2.getInt("price");
				ID  = rs2.getInt("id");
				
				cart ca  = new cart(itemss, quentity,price,ID);
				cartItems.add(ca);
			}	
		}
		catch(Exception e) {
			
		}
		return cartItems;
		
	}
	public static void deleteItems(int id) {
		
		try {
			con3 = DBconnecter.getConnection();
			st3 = con3.createStatement();
			String sql3 = "DELETE FROM cart WHERE id = '"+id+"'";
			int rs3 = st3.executeUpdate(sql3);
			
		}
		catch(Exception e) {
			
		}
	}
	public static void updateItems(int id,int qnt) {
		try {
			con4 = DBconnecter.getConnection();
			st4 = con4.createStatement();
			String sql4 = "UPDATE cart SET quentity = '"+qnt+"' where id= '"+id+"'";
			int rs4 = st4.executeUpdate(sql4);
		}
		catch(Exception e) {
			
		}
	}


}
