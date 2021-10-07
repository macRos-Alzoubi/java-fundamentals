package inheritance;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Theater implements Reviewable {
    private String name;
    private Set<String> moviesList;
    private Map<String, Review> reviews;
    private int stars;


    public Theater() {
    }

    public Theater(String name) {
        this.name = name;
        moviesList = new HashSet<>();
        reviews = new TreeMap<>();
        stars = 0;
    }

    public Set<String> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(Set<String> moviesList) {
        this.moviesList = moviesList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void addMovie(String movie) {
        moviesList.add(movie);
    }

    public void removeMovie(String movie) {
        moviesList.remove(movie);
    }

    private String getMovies() {
        StringBuilder moviesStrList = new StringBuilder();
        for (String movie : moviesList)
            moviesStrList.append(movie).append("\n");
        return moviesStrList.toString();
    }

    private void calculateStars() {
        int allStars = 0;

        for (Map.Entry<String, Review> review : this.reviews.entrySet()) {
            allStars += review.getValue().getStars();
        }

        this.stars = allStars / this.reviews.size();
    }

    private String getReviews() {
        StringBuilder restaurantReviews = new StringBuilder();
        for (Map.Entry<String, Review> review : this.reviews.entrySet()) {
            restaurantReviews.append(review.getValue().toString());
        }
        return restaurantReviews.toString();
    }

    public void addReview(Review review, String movie) {
        if (moviesList.contains(movie)) {
            reviews.put(movie, review);
            calculateStars();
        } else
            System.out.println("The movie is not available right now");
    }

    @Override
    public void addReview(Review review) {
        reviews.put("No movie name", review);
        calculateStars();
    }

    @Override
    public String toString() {
        String theaterStr = "Theater{Name: " + getName() + "\nMovies List{\n";
        String moviesStrList = getMovies();
        String reviewsStr = getReviews();
        return String.format("%s%s\n}\nReviews{\n%s}", theaterStr, moviesStrList, reviewsStr);
    }
}
