package eShopping.eShoppingApp;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
    	
    	User user=(User)context.getBean("user");
    	System.out.println("UserName : "+user.getUserName());
    	System.out.println("Email : "+user.getEmail());
    	System.out.println("Password : "+user.getPassword());
    	System.out.println("Shipping Address : "+user.getShippingAddress());
    	System.out.println("Billing Address : "+user.getBillingAddress());
    	System.out.println("=========================================================================================================\n");
    	
    	Product product=(Product)context.getBean("product");
    	System.out.println("Product Name : "+product.getProductName());
    	System.out.println("Price : "+product.getPrice());
    	System.out.println("Qyantity In Stock : "+product.getQuantityInStock());
    	System.out.println("Image Location : "+product.getImageLocation());
    	System.out.println("=========================================================================================================\n");
    	
    	Cart cart=(Cart)context.getBean("cart");
    	List<Product> productList = cart.getProductList();
    	 for(Product p:productList) {
    		 System.out.println("Product Name : "+p.getProductName());
    	    	System.out.println("Price : "+p.getPrice());
    	    	System.out.println("Qyantity In Stock : "+p.getQuantityInStock());
    	    	System.out.println("Image Location : "+p.getImageLocation());
    		 System.out.println("=========================================================================================================\n");
     		
    	 }
    	System.out.println(cart.getTotalAmount());
    	System.out.println(cart.isStatus());
    	 System.out.println(cart.isConfirmOrder());
    	 System.out.println("=========================================================================================================\n");
    	 
    	 Order order=(Order)context.getBean("order");
    	 List<Cart> cartList=order.getCartList();
    	 for(Cart c:cartList)
    	 {
    		 List<Product> pList=c.getProductList();
    		 for(Product p:pList)
    		 {
    			 System.out.println("Product Name : "+p.getProductName());
    			 System.out.println("Price : "+p.getPrice());
    			 System.out.println("Quanity In Stock : "+p.getQuantityInStock());
    			 System.out.println("Image Location : "+p.getImageLocation());
    			 System.out.println("::::::::::::::::::::::");
    		 }
    		 System.out.println("Total Ammount : "+c.getTotalAmount());
    		 System.out.println("Order Confirmation : "+c.isConfirmOrder());
    		 System.out.println("Order Status"+c.isStatus());
    		 System.out.println("::::::::::::::::::::::");
    		 System.out.println("::::::::::::::::::::::");
    	 }
    	 System.out.println("=========================================================================================================\n");
    	 
    	 
    }
}
