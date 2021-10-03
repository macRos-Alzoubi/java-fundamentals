package inheritance;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("McDonald's", "$$$");

        Review review = new Review("It so good", "Mohammad", 5);
        Review review1 = new Review("It so good", "Tariq", 3);
        Review review2 = new Review("It so good", "Ziad", 2);
        Review review3 = new Review("It so good", "Ahmad", 4);
        Review review4 = new Review("It so good", "Roa'", 1);

        restaurant.addReview(review);
        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);
        restaurant.addReview(review4);

        System.out.println(restaurant);
    }
}
