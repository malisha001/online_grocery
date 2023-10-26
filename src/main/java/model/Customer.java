package model;

public class Customer {

	private static Customer instance;
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	private String password;

	private Customer() {}
	
	public static Customer getInstance() {
		if(instance == null) {
			synchronized(Customer.class){
				if(instance == null) {
					instance = new Customer();
				}
			}
		}
		return instance;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setPassword(String password) {
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
