package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem44{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(12) + 1;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");

        boolean isBreak, isIncrease;
        int count = 0;

        for (int i = 0; i < m; i++) {
            isBreak = true;
            isIncrease = matrix[i][0] < matrix[i][1];
            if (isIncrease) {
                for (int j = 0; j < n - 1; j++) {

                    if (matrix[i][j] >= matrix[i][j + 1] && isBreak) {
                        isBreak = false;

                    }
                    if (j == n - 2 && isBreak) {
                        System.out.println(i + "- index: " + matrix[i][0]);
                        count++;
                    }
                }
            } else {
                for (int j = 0; j < n - 1; j++) {
                    if (matrix[i][j] <= matrix[i][j + 1] && isBreak) {
                        isBreak = false;

                    }
                    if (j == n - 2 && isBreak) {
                        System.out.println(i + "- index: " + matrix[i][n - 1]);
                        count++;
                    }
                }

            }
        }
        if (count == 0) {
            System.out.println(0);
        }
    }
}