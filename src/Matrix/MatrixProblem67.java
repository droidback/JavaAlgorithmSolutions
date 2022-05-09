package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(4) - 1;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");

        int count;
        for (int i = 0; i < n; i++) {
            count =0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] > 0) {
                    count++;
                }
            }
            if (count == m) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < n - 1; k++) {
                        matrix[j][k] = matrix[j][k + 1];
                    }
                    matrix[j][n - 1] = 0;
                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInts : ints) {
                System.out.printf("%3s", anInts);
            }
            System.out.println();
        }
    }
}
