package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");
        int maxIndex = 0, sum = 0, maxRaw = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            if (maxRaw < sum) {
                maxRaw = sum;
                maxIndex = i;
            }
            sum = 0;
        }
        System.out.println("max index: " + maxIndex);
        System.out.println("sum of raw " + maxRaw);
    }
}