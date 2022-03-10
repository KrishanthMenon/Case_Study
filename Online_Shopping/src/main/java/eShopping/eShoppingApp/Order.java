package eShopping.eShoppingApp;

import java.util.List;

public class Order {
	
	private List<Cart> cartList;
	public Order()
	{
		
	}

	public Order(List<Cart> cartList) {
		super();
		this.cartList = cartList;
	}

	public List<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
}
