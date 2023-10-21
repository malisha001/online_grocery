package service;

import java.util.List;

import model.Customer;

public interface iCustomerService {
	//create account
	public boolean insertaccount(String fname, String lname,String email, String phone, String password,String username);
	//validate customer
	public boolean validate(String userN,String passw);
	
	//get user details
	public List<Customer> getcustomerprofile(String userN);
	
	//delete user details
	public boolean deleteCustomer(String email);
	
	//update user details
	public boolean Updatecustomer(String id,String fname, String lname, String email, String phone, String password);
	
	//report customer issue(insert)
	public boolean customerReport(String customerName, String customerEmail,String phonenumber, String about);
}
