package home;

public class items {
	private int id;
	private String itemImg;
	private String name;
	private float price;
	
	
	public items(int id, String itemImg, String name, float price) {
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "items [id=" + id + ", itemImg=" + itemImg + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

