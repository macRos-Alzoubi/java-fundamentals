package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;

    public Review() {
    }

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        if (stars >= 0 && stars <= 5)
            this.stars = stars;
        else if(stars > 5)
            this.stars = 5;
        else
            this.stars = 0;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return String.format("%s Says\n%s\n%d\n\n", author, body, stars);
    }
}
