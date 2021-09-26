import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main {

    public static LocalDateTime now;
    public static String time;

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(5);
        clock();

    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1)
            return word + 's';
        else
            return word;
    }

    public static void flipNHeads(int n) {
        double randNum;
        int flips = 0;
        int numberOfHeadsInRow = 0;

        while(numberOfHeadsInRow != n){
            randNum = Math.random();

            if(randNum < 0.5){
                System.out.println("tails");
                numberOfHeadsInRow = 0;
            }else{
                System.out.println("heads");
                numberOfHeadsInRow++;
            }
            flips++;
        }

        System.out.printf("It took %d flips to flip %d heads in a row", flips, n);
    }

    public static void clock(){
        while(true) {
            now = LocalDateTime.now();
            time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

    }
}
