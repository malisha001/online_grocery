package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Customer;
import online_grocery.DBconnecter;

public class CustomerServiceImpl implements iCustomerService{
	
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs  = null;
	
	//validate customer
	@Override
	public char validate(String userN, String passw) {
		
		boolean result;
		char log = 'b';
		try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
			
			String sql = "SELECT * FROM customerprofile WHERE email = '" + userN + "' AND password = '" + passw + "'";
			String sql1 = "SELECT * FROM admin WHERE email = '" + userN + "' AND password = '" + passw + "'";
			
			rs = st.executeQuery(sql);
		    result = rs.next();

		    if (result) {
		        log = 'c'; // Set log to 'c' for customer authentication
		    } else {
		        rs = st.executeQuery(sql1);
		        result = rs.next();
		        if (result) {
		            log = 'a'; // Set log to 'a' for admin authentication
		        }
		    }
		}
		catch(Exception e) {
			   e.printStackTrace();
		}
		return log;	
	}
	
	//retrieve customer details
	@Override
	public List<Customer> getcustomerprofile(String userN) {
		   ArrayList<Customer> cus = new ArrayList<>();
		   
		   try {
			   con = DBconnecter.getConnection();
			   st = con.createStatement();
			   String sql = "select * from customerprofile where Email='"+userN+"'";
			   rs = st.executeQuery(sql);

			   while(rs.next()) {
				   int id = rs.getInt(1);
				   String fname = rs.getString(2);
				   String lname = rs.getString(3);
				   String email = rs.getString(4);
				   String phone = rs.getString(5);
				   String password = rs.getString(6);
				   
				   Customer c = Customer.getInstance();
				   c.setFirstname(fname);
				   c.setLastname(lname);
				   c.setId(id);
				   c.setEmail(email);
				   c.setPhonenumber(phone);
				   c.setPassword(password);
				   cus.add(c);
			   }   
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		return cus;
	}
	//delete customer
	@Override
	public boolean deleteCustomer(String email) {
boolean IsSuccess = false;
    	
    	try {
    		con = DBconnecter.getConnection();
			st = con.createStatement();
    		String sql = "delete from customerprofile where Email= '"+email+"'";

    		int r = st.executeUpdate(sql);
    		
    		if (r > 0) {
    			IsSuccess = true;
    		}
    		else {
    			IsSuccess =false;
    		}
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
		return IsSuccess;

	}
	//update customer
	@Override
	public boolean Updatecustomer(String id, String fname, String lname, String email, String phone, String password) {
boolean isCorrect = false;
    	try {
    		con = DBconnecter.getConnection();
    		st = con.createStatement();
    		String sql = "update customerprofile set FirstName='"+fname+"', LastName='"+lname+"', Email='"+email+"', PhoneNumber='"+phone+"', PassWord='"+password+"'" + "where id='"+id+"'";
    		
    		int rs = st.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isCorrect = true;
    		}
    		else {
    			isCorrect = false;
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
		return isCorrect;
	}

	@Override
	public boolean customerReport(String customerName, String customerEmail, String phonenumber, String about) {
		boolean isCorrect = false;
		 
		 try {
			 con = DBconnecter.getConnection();
	    	st = con.createStatement();
	         String sql = "insert into cutomerissue(CustomerName, CustomerEmail, phoneNumber, About) values ('"+customerName+"', '"+customerEmail+"', '"+phonenumber+"', '"+about+"')";
			 int rs = st.executeUpdate(sql);
			 
			 if(rs > 0) {
				 isCorrect =true;
			 }
			 else {
				 isCorrect = false;
			 }
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 return isCorrect;
			
	}
	//create account
	@Override
	public boolean insertaccount(String fname, String lname, String email, String phone, String password) {
		boolean isCorrect = false;
   	 
   	 try {
	   		con = DBconnecter.getConnection();
			st = con.createStatement();
            String sql = "insert into customerprofile(FirstName, LastName, Email, PhoneNumber, PassWord) values ('"+fname+"', '"+lname+"', '"+email+"', '"+phone+"', '"+password+"')";
   		 int rs = st.executeUpdate(sql);
   		 
   		 if(rs > 0) {
   			 isCorrect =true;
   		 }
   		 else {
   			 isCorrect = false;
   		 }
   	 }
   	 catch (Exception e) {
   		 e.printStackTrace();
   	 }
   	 return isCorrect;
	}

	@Override
	public boolean insertpayment(String fname, String email, String address, String city, String zip, String cardName,
			String cardNo, String expM, String expY, String cvv) {
		boolean isCorrect = false;
		 
		 try {
			con = DBconnecter.getConnection();
			st = con.createStatement();
	         String sql = "insert into new_table values(0,'"+fname+"', '"+email+"', '"+address+"', '"+city+"', '"+zip+"', '"+cardName+"','"+cardNo+"', '"+expM+"','"+expY+"', '"+cvv+"')";
			 int rs = st.executeUpdate(sql);
			 
			 if(rs > 0) {
				 isCorrect =true;
			 }
			 else {
				 isCorrect = false;
			 }
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 return isCorrect;

	}

}
