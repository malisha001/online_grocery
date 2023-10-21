package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;
import home.items;
import online_grocery.DBconnecter;

public class HomepageServiceImpl implements iHomepageService{
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs  = null;
	
	@Override
	public List<Items> getItemDetails() {
		// TODO Auto-generated method stub
		ArrayList<Items> item = new ArrayList<>();
		
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql = "select * from itemnew";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String itemImg = rs.getString(2);
				String itemName = rs.getString(2);
				double price = rs.getDouble(5);
				
				Items it = new Items(id,itemImg,itemName,price);
				item.add(it);
				
			}

		}
		 catch(Exception e) {
			 
		 }
		return item;
	}

	
}
