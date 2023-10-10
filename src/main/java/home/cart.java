package home;

public class cart {

	String ItemName;
	String username;
	int Quentity;
	int price;
	
	public cart( String itemName, String username, int quentity, int price) {
		super();

		ItemName = itemName;
		this.username = username;
		Quentity = quentity;
		this.price = price;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getQuentity() {
		return Quentity;
	}
	public void setQuentity(int quentity) {
		Quentity = quentity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "cart [ItemName=" + ItemName + ", Quentity=" + Quentity + ", price=" + price
				+ "]";
	}
	
	
}
