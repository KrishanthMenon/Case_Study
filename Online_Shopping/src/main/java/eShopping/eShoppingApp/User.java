package eShopping.eShoppingApp;

public class User {

	private String userName;
	private String email;
	private String password;
	private String shippingAddress;
	private String billingAddress;
	
	public User()
	{
		
	}

	public User(String userName, String email, String password, String shippingAddress, String billingAddress) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
}
