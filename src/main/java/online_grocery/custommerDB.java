package online_grocery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class custommerDB {
	
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs  = null;
	
	public static List<custommer> validate(String username,String password){
		ArrayList<custommer> cus = new ArrayList<>();
		
		System.out.print(username);

		
		//validate

		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
		

		System.out.print("password:"+password);
		String query = "select * from custommers where email='" + username + "' and password='" + password + "'";

		rs = st.executeQuery(query);
		
		if(rs.next()) {
			
			String email = rs.getString("email");
			int id = 0;
			String name = "null";
			int phone = 0;
			String passs = "null";
			
			custommer c = new custommer(id,name,email,phone,passs);
			cus.add(c);

			System.out.print(email);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print(cus);
		return cus;
		
	}
	
}
