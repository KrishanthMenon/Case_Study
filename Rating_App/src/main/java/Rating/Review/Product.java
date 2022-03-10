package Rating.Review;

//import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	private int productId;
	private String product_name;
	private String description;
	private int rating;
	private Review review;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Product(int productId, String product_name, String description, int rating, Review review) {
		super();
		this.productId = productId;
		this.product_name = product_name;
		this.description = description;
		this.rating = rating;
		this.review = review;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
}
