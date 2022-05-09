package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(12);
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");
        System.out.println("enter k: ");
        int k = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = k; j < m - 1; j++) {
                matrix[j][i] = matrix[j + 1][i];
            }
            matrix[m - 1][i] = 0;
        }

        for (int[] ints : matrix) {
            for (int anInts : ints) {
                System.out.printf("%3s", anInts);
            }
            System.out.println();
        }

    }
}
