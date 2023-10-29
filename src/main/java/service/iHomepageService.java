package service;

import java.util.List;

import model.*;


public interface iHomepageService {
	//show items from database
	public List<Items> getItemDetails();
	
	//show item when click each catergory
	public List<Items>getcatergary(String id);
}
