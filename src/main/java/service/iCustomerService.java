package service;

import java.util.List;

import model.Customer;

public interface iCustomerService {
	//create account
	public boolean insertaccount(String fname, String lname,String email, String phone, String password);
	
	//validate customer
	public char validate(String userN,String passw);
	
	//get user details
	public List<Customer> getcustomerprofile(String userN);
	
	//delete user details
	public boolean deleteCustomer(String email);
	
	//update user details
	public boolean Updatecustomer(String id,String fname, String lname, String email, String phone, String password);
	
	//report customer issue(insert)
	public boolean customerReport(String customerName, String customerEmail,String phonenumber, String about);
	
	//get payment details
	public boolean insertpayment(String fname, String email, String address, String city, String zip, String cardName, String cardNo, String expM, String expY, String cvv);
}
