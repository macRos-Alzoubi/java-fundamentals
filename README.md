# java-fundamentals

## Table Of Contenet

| Directory | Methodes |
|----------|:-------------:|
|  basics (Lab-1) |  pluralize, flipNHeads, clock |
|    basiclibrary  (Lab-2) | roll, containsDuplicates, contains, calculatingAverages, lowestAverageList, weatherAnalyzer, tally|
|    linter  (Lab-3) | javaScriptLinter |
|    inheritance  (Lab-6) | Restaurans, Review |

## basics (Lab 1)

- **pluralize** method:

  accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

- **flipNHeads** method:

  accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

- **clock** method:

  method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

## basiclibrary (Lab 2)

- **roll** method:

  that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

- **containsDuplicates** method:
  that returns true or false depending on whether the array contains duplicate values.

- **calculatingAverages** method:

  accepts an array of integers and calculates and returns the average of all the values in the array.

- **lowestAverageList** method:

  accepts an array of arrays calculate the average value for each array and return the array with the lowest average.

- **weatherAnalyzer** method:
  accepts an array of arrays of tempreture of a given month Return that String containing any temperature not seen during the month.

- **tally** method:

  accepts a List of Strings representing votes and returns one string to show what got the most votes.

## linter (Lab 3)

- **javaScriptLinter** method:

  reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

  Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.

  - Don’t show an error if the line is empty.
  - Don’t show an error if the line ends with an opening curly brace `{`
  - Don’t show an error if the line ends with an closing curly - brace `}`
  - Don’t show an error if the line contains `if` or `else`

## inheritance (Lab 6)

- **Restaurant** Class

  - **String name** attribute
  - **String price** attribute
  - **int Stars** attribute
  - **Set<Review>** attribute

  - **Restaurant** constructor:
    that initialize class attributes
  - **addReview** method:
    that add a review to the set of reviews
  - **calculateStars** method:
    that calculate restaurant stars number
  - **toString** method:
    that return a formatted string contains all restaurant info.
  - **getReviews** method:
    that return a formatted string contains all reviews info.

- **Review** Class:

  - **String body** attribute
  - **String author** attribute
  - **int stars** attribute

  - **Review** constructor:
    that initialize class attributes
  - **getStars** method:
    that returns the number of stars of a review
  - **toString** method:
    that return a formatted string contains all review info.

