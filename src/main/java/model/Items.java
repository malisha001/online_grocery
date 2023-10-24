package model;

public class Items {
	private int id;
	private String itemImg;
	private String name;
	private String catergories;
	private double price;
	
	
	public Items(int id, String itemImg, String name,String catergories, double price) {
		this.id = id;
		this.itemImg = itemImg;
		this.name = name;
		this.price = price;
		this.catergories = catergories;
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
	public String getCatergories() {
		return catergories;
	}
	public void setCatergories(String catergories) {
		this.catergories = catergories;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", itemImg=" + itemImg + ", name=" + name + ", catergories=" + catergories
				+ ", price=" + price + "]";
	}
	


}
