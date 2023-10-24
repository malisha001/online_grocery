package home;

public class cart {

	String ItemName;
	int Quentity;
	int price;
	int id;
	
	public cart(String ItemName,int Quentity,int price,int Id) {
		this.ItemName = ItemName;
		this.Quentity = Quentity;
		this.price = price;
		this.id = Id;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "cart [ItemName=" + ItemName + ", Quentity=" + Quentity + ", price=" + price + ", id=" + id + "]";
	}
	


	
	
}
