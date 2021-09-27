/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.checkerframework.checker.units.qual.A;

import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public int[] roll(int n) {

        int[] values = new int[n];
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < n; i++) {
            randomNumber = random.nextInt(6) + 1;
            values[i] = randomNumber;
        }

        return values;
    }


    public boolean containsDuplicates(int[] array) {
        boolean isDuplicate = false;
        for (int i = 0; i < array.length; i++)
            if (contains(array, array[i], i + 1)) {
                isDuplicate = true;
                break;
            }

        return isDuplicate;
    }

    public boolean contains(int[] array, int element, int startPos) {
        for (int i = startPos; i < array.length; i++)
            if (array[i] == element)
                return true;

        return false;
    }

    public double calculatingAverages(int[] array) {
        int sum = 0;
        for (int num : array)
            sum += num;

        return (double )sum / array.length;
    }

    public int[] lowestAverageList(int[][] arr) {
        double[] AVGs = new double[arr.length];
        int lowestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++)
                sum += arr[i][j];
            AVGs[i] = (double) (sum / arr[i].length);
        }

        for (int i = 0; i < AVGs.length - 1; i++) {
            double lowest = AVGs[i];
            if (lowest > AVGs[i + 1]) {
                lowest = AVGs[i + 1];
                lowestIndex = i + 1;
            }
        }

        return arr[lowestIndex];
    }


}
