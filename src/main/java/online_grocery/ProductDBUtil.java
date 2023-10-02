package online_grocery;

import java.sql.Connection;

import com.mysql.jdbc.Statement;

public class ProductDBUtil {
	public static boolean insertProduct(String name, String id, String category, String brand, String description) {
		
		boolean isSuccess = false;
		
		//create db connection
		String url = ;
		String user = "root";
		String pass = "BinuMySQL";
		
		try {
			Class.forName("");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement start = con.createStatement();
			String sql = "insert into product values (0,)"
			int rs = start.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else  {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
