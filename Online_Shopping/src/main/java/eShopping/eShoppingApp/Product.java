package eShopping.eShoppingApp;

public class Product {
	private String productName;
	private double price;
	private int quantityInStock;
	private String imageLocation;
	
	public Product()
	{
		
	}
	public Product(String productName, double price, int quantityInStock, String imageLocation) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantityInStock = quantityInStock;
		this.imageLocation = imageLocation;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}
}
