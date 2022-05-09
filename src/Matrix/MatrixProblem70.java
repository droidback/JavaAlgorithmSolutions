package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem70 {
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

        int max = Integer.MIN_VALUE, index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    index = i;
                }
            }
        }
        if (index != m - 1) {
            for (int i = 0; i < n; i++) {
                for (int j = m - 1; j > index; j--) {
                    matrix[j][i] = matrix[j - 1][i];
                }
                matrix[index + 1][i] = matrix[index][i];
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
