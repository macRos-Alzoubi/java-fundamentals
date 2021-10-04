package inheritance;

import java.util.HashSet;
import java.util.Set;

public class Shop implements Reviewable {
    private String name;
    private String description;
    private String price;
    private int stars;
    Set<Review> reviews;

    public Shop() {
    }

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        stars = 0;
        reviews = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    private void calculateStars() {
        int allStars = 0;

        for (Review review : this.reviews) {
            allStars += review.getStars();
        }

        this.stars = allStars / this.reviews.size();
    }

    private String getReviews() {
        StringBuilder storeReviews = new StringBuilder();
        for (Review review : this.reviews) {
            storeReviews.append(review.toString());
        }
        return storeReviews.toString();
    }

    @Override
    public String toString() {
        return String.format("Shop{Name: %s,Description: %s, Price: %s, Stars: %d}\nReviews{\n%S}",
                name, description, price, stars, getReviews());
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
        calculateStars();
    }


}
