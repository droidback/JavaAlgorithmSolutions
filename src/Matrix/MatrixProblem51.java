package Matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixProblem51 {
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
        int minIndex = 0, maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    minIndex = i;
                }
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    maxIndex = i;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            matrix[minIndex][i] = matrix[minIndex][i] + matrix[maxIndex][i];
            matrix[maxIndex][i] = matrix[minIndex][i] - matrix[maxIndex][i];
            matrix[minIndex][i] = matrix[minIndex][i] - matrix[maxIndex][i];
        }
        for (int[] ints :matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
