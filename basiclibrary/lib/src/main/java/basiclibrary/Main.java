package basiclibrary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        int[] values = lib.roll(6);
        for (int elem : values)
            System.out.print(elem + " ");

        System.out.println();

        int[] arr = {3, 1, 2, 5, 3};
        System.out.println(Arrays.toString(arr));

        System.out.println(lib.containsDuplicates(arr));

        System.out.println(lib.calculatingAverages(arr));

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(Arrays.toString(lib.lowestAverageList(weeklyMonthTemperatures)));
    }
}