package Rating.Review;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 @SuppressWarnings("resource")
    	 ApplicationContext context = new ClassPathXmlApplicationContext("rating.xml");
         System.out.println("===========================================================================");
         
         Product Product = context.getBean("Product", Product.class);
         System.out.println(Product.getProductId());
         System.out.println(Product.getProduct_name());
         System.out.println(Product.getDescription());
         System.out.println(Product.getRating());
         System.out.println("===========================================================================");
         System.out.println();
         
         User user=context.getBean("user", User.class);
         System.out.println(user.getUserName());
         System.out.println(user.getEmailId());
         System.out.println(user.getPassword());
         System.out.println(user.getMobileNo());
         System.out.println("===========================================================================");
         System.out.println();
         
         System.out.println(Product.getReview().getReviewid());
         System.out.println(Product.getReview().getProduct_reviewed());
         System.out.println(Product.getReview().getReview_text());
         System.out.println("===========================================================================");
         System.out.println();
         
         for(Comment c :Product.getReview().getComments()) {
        	 System.out.println(c.getCommentId());
        	 System.out.println(c.getCommentText());
        	 System.out.println(c.getLikes());
        	 System.out.println(c.getDislikes());
        	 System.out.println(c.isReport());
        	 System.out.println();
        	 System.out.println();
         }
         System.out.println("===========================================================================");
         System.out.println();
    }
}
