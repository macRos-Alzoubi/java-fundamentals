package inheritance;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {
    private String name;
    private int stars;
    private String price;
    private Set<Review> reviews;

    public Restaurant() {
    }

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
        this.stars = 0;
        reviews = new HashSet<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
        calculateStars();
    }

    private void calculateStars() {
        int allStars = 0;

        for (Review review : this.reviews) {
            allStars += review.getStars();
        }

        this.stars = allStars / this.reviews.size();
    }

    @Override
    public String toString() {
        String formattedString = "";
        formattedString += "Restaurant name: " + name + "\n" + "Price: " + price + "\n" + "Stars: " + stars + "\n\n";
        formattedString += getReviews();
        return formattedString;
    }

    private String getReviews() {
        StringBuilder restaurantReviews = new StringBuilder();
        for (Review review : this.reviews) {
            restaurantReviews.append(review.toString());
        }
        return restaurantReviews.toString();
    }
}
