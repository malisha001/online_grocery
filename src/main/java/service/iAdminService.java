package service;

import java.util.List;

import com.admin.Items;

public interface iAdminService {
	//add product
	public boolean addproduct(String Name,String Category,String Brand,double UnitPrice,int Quantity,String Description );
	
	//update product details
	public boolean updateProducts(String id,String name, String cat, String brand, String price, String qty, String dis );
	
	//show items details 
	public List<Items> getItemDetails(String id);
	
	//delete items 
	public boolean deleteProducts(String id);
	
	//get all items details
	public List<Items> getAllItemDetails();
}
