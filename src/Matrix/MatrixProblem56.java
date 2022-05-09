package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem56 {
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

        for (int i = 0; i < matrix[i].length / 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = matrix[j][i] + matrix[j][n / 2 + i];
                matrix[j][n / 2 + i] = matrix[j][i] - matrix[j][n / 2 + i];
                matrix[j][i] = matrix[j][i] - matrix[j][n / 2 + i];
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
            System.out.println();
        }
    }
}
