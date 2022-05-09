package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem46 {
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

        int maxRaw;
        int columnIndex;
        boolean isMax = true;
        int maxElement = 0;
        for (int i = 0; i < m; i++) {
            maxRaw = Integer.MIN_VALUE;
            columnIndex = 0;
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] > maxRaw) {
                    maxRaw = matrix[i][j];
                    columnIndex = j;
                }
            }
            for (int j = i + 1; j < m; j++) {
                if (maxRaw > matrix[j][columnIndex] && isMax) {
                    isMax = false;
                }
                if (isMax && j == m - 1) maxElement = maxRaw;
            }
        }
        if (isMax)
            System.out.println(maxElement);
        else System.out.println(0);
    }
}