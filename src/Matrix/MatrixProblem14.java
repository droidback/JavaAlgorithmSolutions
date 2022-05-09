package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9) - 1;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length - i; ++j) {
                System.out.print(matrix[j][i] + " ");
            }
            for (int k = i + 1; k < matrix.length; ++k) {
                System.out.print(matrix[matrix.length - i - 1][k]+" ");
            }
            System.out.println();
        }
    }
}
