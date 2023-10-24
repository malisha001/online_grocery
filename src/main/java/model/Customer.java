package model;

public class Customer {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	private String password;

	public Customer(int id, String firstname, String lastname, String email, String phonenumber, String password) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;

	}
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	
	public String getPassword() {
		return password;
	}
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phonenumber=" + phonenumber + ", password=" + password + "]";
	}
	
}
