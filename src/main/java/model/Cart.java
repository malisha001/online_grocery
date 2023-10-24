package model;

public class Cart {
	String ItemName;
	int Quentity;
	double price;
	int id;
	double tprice;
	
	public Cart(String ItemName,int Quentity,double price,int Id,double tprice) {
		this.ItemName = ItemName;
		this.Quentity = Quentity;
		this.price = price;
		this.id = Id;
		this.tprice = tprice;
		// TODO Auto-generated constructor stub
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTprice() {
		return tprice;
	}
	public void setTprice(double tprice) {
		this.tprice = tprice;
	}
	@Override
	public String toString() {
		return "Cart [ItemName=" + ItemName + ", Quentity=" + Quentity + ", price=" + price + ", id=" + id + ", tprice="
				+ tprice + "]";
	}

}
