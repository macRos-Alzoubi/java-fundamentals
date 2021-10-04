package inheritance;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("McDonald's", "$$$");
        Shop shop = new Shop("500", "Clothing shop", "$$");
        Theater theater = new Theater("Movie House");

        restaurant.addReview(new Review("It so good", "Mohammad", 5));
        restaurant.addReview(new Review("It so good", "Tariq", 3));
        restaurant.addReview(new Review("It so good", "Ziad", 2));

        shop.addReview(new Review("the shop was amazing", "Max", 5));
        shop.addReview(new Review("the shop was good", "Ahmad", 5));
        shop.addReview(new Review("the shop was so good", "Hashim", 4));
        shop.addReview(new Review("the shop was awful ", "Anas", 2));

        theater.addMovie("The Terminator");
        theater.addMovie("I'm Dived");
        theater.addMovie("Cast away");
        theater.addMovie("T-34");
        theater.addMovie("Transformers");
        theater.addMovie("The last samurai");
        theater.addMovie("Transporter 3");

        theater.addReview(new Review("The theater was soo good", "Mohammad", 5), "The Terminator");
        theater.addReview(new Review("The theater was awesome", "Khalid", 4), "Cast away");
        theater.addReview(new Review("The theater was not bad", "Khalid", 5), "I'm Dived");
        theater.addReview(new Review("The theater was not bad", "Moa'th", 3), "T-34");
        theater.addReview(new Review("The theater was really amazing ", "Roa'", 4));

        System.out.println(restaurant);
        System.out.println(shop);
        System.out.println(theater);
    }
}
