package com.admin;

public class Items {
	private int id;
	private String name;
	private String category;
	private String  brand;
	private double unitPrice;
	private int quantity;
	private String description;
	
	public Items(int id, String name, String category, String brand, double unitPrice, int quantity,
			String description) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public String getBrand() {
		return brand;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getDescription() {
		return description;
	}
	
	
	
	
}
