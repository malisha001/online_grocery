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
	
	public static List<cart> getItems(int itemsId){
		
		ArrayList<cart> cartitems = new ArrayList<>();
		
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql = "select * from item where itemID = '"+itemsId+"'";
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				int cartid = 0;
				String ItemName = null;
				int Quentity = 0;
				int price = 0;
				
				cart c = new cart(cartid,ItemName,Quentity,price);
				cartitems.add(c);
			}
		}
		catch(Exception e) {
			
		}
		
		return cartitems;
	}
	public static void Insertitems(List<cart> itemsList) throws SQLException {
		con1 = DBconnecter.getConnection();
		st1 = con1.createStatement();
		
		for (cart item : itemsList) {
	        String ItemName = item.getItemName();
	        int Quentity = item.getQuentity();
	        int price = item.getPrice();

	        String sql = "INSERT INTO cart (itemName, quantity, price) VALUES ('" + ItemName + "', '" + Quentity + "', '" + price + "')";
	        st1.executeUpdate(sql);
	    }
	}
}
