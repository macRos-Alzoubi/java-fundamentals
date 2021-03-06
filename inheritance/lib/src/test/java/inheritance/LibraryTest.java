/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void RestaurantToString(){
        Restaurant restaurant = new Restaurant("500", "$$$");
        String str = restaurant.toString();
        assertEquals(str, restaurant.toString(), "Method should print the reviews of Restaurants");
    }

    @Test
    public void ReviewToString(){
        Review review = new Review("It is amazing restaurant","Mohammad",2);
        String str = review.toString();
        assertEquals(str, review.toString(),"Method should print the reviews of users");
    }

    @Test
    public void isAssociated(){
        Restaurant restaurant = new Restaurant("500", "$$$");
        Review review = new Review("It is amazing restaurant","Mohammad",2);
        restaurant.addReview(review);

        String resStr = restaurant.toString();
        String revStr = review.toString();

        assertTrue(resStr.contains(revStr));
    }

    @Test
    public void testShop(){
        Shop shop = new Shop("500", "Clothing shop", "$$");

        shop.addReview(new Review("the shop was good", "Ahmad", 5));
        shop.addReview(new Review("the shop was so good", "Hashim", 4));

        assertEquals("500", shop.getName(), "The method should return the shop name");
        assertEquals("Clothing shop", shop.getDescription(), "The method should return shop description");
        assertTrue(shop.toString().contains("THE SHOP WAS SO GOOD"),"The method should add a review to the shop!.");
    }

    @Test
    public void shopReview(){
        Shop shop = new Shop("500", "Clothing shop", "$$");

        shop.addReview(new Review("the shop was good", "Ahmad", 5));
        shop.addReview(new Review("the shop was so good", "Hashim", 4));

        assertTrue(shop.toString().contains("THE SHOP WAS SO GOOD"),"The method should add a review to the shop!.");
    }

    @Test
    public void theaterTest(){
        Theater theater = new Theater("Movie House");

        theater.addMovie("The Terminator");
        theater.addMovie("I'm Dived");
        theater.addMovie("Cast away");
        theater.addMovie("T-34");
        theater.addMovie("Transformers");
        theater.addMovie("The last samurai");

        theater.addReview(new Review("The theater was soo good", "Mohammad", 5), "The Terminator");
        theater.addReview(new Review("The theater was awesome", "Khalid", 4), "Cast away");
        theater.addReview(new Review("The theater was not bad", "Khalid", 5), "I'm Dived");

        assertEquals("Movie House", theater.getName());
        assertTrue(theater.toString().contains("T-34"));
    }

    @Test
    public void addMovie(){
        Theater theater = new Theater("Movie House");

        theater.addMovie("The Terminator");
        theater.addMovie("I'm Dived");
        theater.addMovie("Cast away");
        theater.addMovie("T-34");
        theater.removeMovie("Cast away");

        assertTrue(theater.getMoviesList().contains("T-34"));
    }

    @Test
    public void removeMovie(){
        Theater theater = new Theater("Movie House");

        theater.addMovie("The Terminator");
        theater.addMovie("I'm Dived");
        theater.addMovie("Cast away");
        theater.addMovie("T-34");
        theater.removeMovie("Cast away");

        assertFalse(theater.getMoviesList().contains("Cast away"));
    }

}
