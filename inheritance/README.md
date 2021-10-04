# Inheritance and Interfaces

## Restaurant Class
Class that represent a restaurant it has

- name of type String
- stars of type int
- price of type String
- Set of reviews

- Restaurant: constructor tha initialize the class attributes
- addReview: method that add a review to the set of reviews
- calculateStars: method that calculate restaurant stars number
- toString: method that return a formatted string contains all restaurant info.
- getReviews: method that return a formatted string contains all reviews info.

## Review Class
Class that represent a users reviews it has

- author of type String
- stars of type int
- body of type String

- Review: constructor that initialize class attributes
- getStars: method that returns the number of stars of a review
- calculateStars: method that calculate restaurant stars number
- toString: that return a formatted string contains all review info.

## Shop
Class that represent a shop it has

- name of type String
- description of type String
- price of type String
- stars of type int
- reviews of type Set<Review>

- Shop: constructor that initialize class attributes
- setters and getters for the class attributes
- calculateStars: method that calculate restaurant stars number
- addReview : method that add reviews to the shop
- getReviews: method that return all the shops reviews as string
- toString: that return a formatted string contains all review info.


## Theater
Class that represent a shop it has

- name of type String
- moviesList of type Set<String>
- reviews of type Map<String, Review>
- stars of type int

- Theater: constructor that initialize class attributes
- setters and getters for the class attributes
- addReview : method that add reviews to the shop
- addMovie : method that add a given movie name to the movies list
- removeMovie: method that remove a given movie name from the movies list
- getReviews: method that return all the shops reviews as string
- getMovies: Method that return all movies available in a theater
- calculateStars: method that calculate restaurant stars number
- toString: that return a formatted string contains all review info.
