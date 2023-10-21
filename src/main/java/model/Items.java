package model;

public class Items {
	private int id;
	private String itemImg;
	private String name;
	private double price;
	
	
	public Items(int id, String itemImg, String name, double price) {
		this.id = id;
		this.itemImg = itemImg;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemImg() {
		return itemImg;
	}
	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "items [id=" + id + ", itemImg=" + itemImg + ", name=" + name + ", price=" + price + "]";
	}
	

}
