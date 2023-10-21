package service;

import java.util.List;

import model.*;
import home.items;

public interface iHomepageService {
	//show items from database
	public List<Items> getItemDetails();
}
