package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem69 {
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
        int k = scan.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j > k + 1; j--) {
                matrix[i][j] = matrix[i][j - 1];
            }
            matrix[i][k + 1] = 1;
        }

        for (int[] ints : matrix) {
            for (int anInts : ints) {
                System.out.printf("%3s", anInts);
            }
            System.out.println();
        }
    }
}
