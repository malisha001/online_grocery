package model;

public class Items {
	private int id;
	private String name;
	private String category;
	private String  brand;
	private double price;
	private int quantity;
	private String description;
	private String img;
	
	public Items(int id,String name,String catergories,String  brand, double price,int quantity,String description,String img) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.category = catergories;
		this.quantity = quantity;
		this.description = description;
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return category;
	}
	public void setCatergories(String catergories) {
		this.category = catergories;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", category=" + category + ", brand=" + brand + ", price=" + price
				+ ", quantity=" + quantity + ", description=" + description + ", img=" + img + "]";
	}
	
	
}
