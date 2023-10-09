package home;

public class cart {
	int cartid;
	String ItemName;
	int Quentity;
	int price;
	
	
	public cart(int cartid, String itemName, int quentity, int price) {
		super();
		this.cartid = cartid;
		ItemName = itemName;
		Quentity = quentity;
		this.price = price;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
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
	@Override
	public String toString() {
		return "cart [cartid=" + cartid + ", ItemName=" + ItemName + ", Quentity=" + Quentity + ", price=" + price
				+ "]";
	}
	
	
}
