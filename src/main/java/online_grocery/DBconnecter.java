package online_grocery;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnecter {
	private static String url = "jdbc:mysql://localhost:3306/onlinegrocerystore";
	private static String userName = "root";
	private static String password = "1175";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
		}
		catch(Exception e) {
			System.out.println("database  connection is not succes");
		}
		return con;
	}
}
