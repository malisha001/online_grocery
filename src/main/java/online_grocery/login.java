package online_grocery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class login {
	private static boolean result;
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs  = null;
	
	public static boolean validate(String userN,String passw) {
		
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			
			System.out.println(userN);
			
			String sql = "SELECT * FROM custommers WHERE email = '" + userN + "' AND password = '" + passw + "'";
			
			rs = st.executeQuery(sql);
			result  = rs.next();
		}
		catch(Exception e) {
			
		}
		System.out.println(result);
		return result;
	}
}
