package service;

import java.util.List;

import home.cart;
import model.Cart;

public interface iCartService {
	
	
//	add items from home to cart their own cart(insert)
	public boolean getItems(int itemId,int quentity,String userID);
	
//  show items their own cart
	public List<Cart> getCartDetails(String username);
	
//remove items from user's cart
	public void deleteItems(int id);
	
//update quantity of items in cart
	public void updateItems(int id,int qnt,double total);
	
}
