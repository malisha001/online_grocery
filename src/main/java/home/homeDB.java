package home;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import online_grocery.DBconnecter;

public class homeDB {
	
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs  = null;
	
	public static List<items> getItemDetails(){
		
		ArrayList<items> item = new ArrayList<>();
		
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			String sql = "select * from item";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String itemImg = rs.getString(2);
				String itemName = rs.getString(3);
				float price = rs.getFloat(4);
				
				items it = new items(id,itemImg,itemName,price);
				item.add(it);
				
			}

		}
		 catch(Exception e) {
			 
		 }
		return item;
	}
}
