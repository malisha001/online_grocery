package service;

import java.util.List;

import model.Items;

public interface iAdminService {
	//add product
	public boolean addproduct(String Name,String Category,String Brand,String UnitPrice,String Quantity,String img,String Description );
	
	//update product details
	public boolean updateProducts(String id,String name, String cat, String brand, String price, String qty, String dis );
	
	//delete items 
	public boolean deleteProducts(String id);
	
	//get all items details
	public List<Items> getAllItemDetails();
}
