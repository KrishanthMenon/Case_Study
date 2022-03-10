package eShopping.eShoppingApp;

import java.util.List;

public class Cart {
	
	private List<Product> productList;
	private float totalAmount;
	private boolean status;
	private boolean confirmOrder;
	public Cart()
	{
		
	}
	public Cart(List<Product> productList, float totalAmount, boolean status, boolean confirmOrder) {
		super();
		this.productList = productList;
		this.totalAmount = totalAmount;
		this.status = status;
		this.confirmOrder = confirmOrder;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isConfirmOrder() {
		return confirmOrder;
	}
	public void setConfirmOrder(boolean confirmOrder) {
		this.confirmOrder = confirmOrder;
	}
}
