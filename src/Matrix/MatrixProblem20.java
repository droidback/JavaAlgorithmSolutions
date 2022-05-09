package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

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
        int multiplication = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                multiplication *= matrix[j][i];
            }
            System.out.println("multiplication of column " + i + " = " + multiplication);
            multiplication = 1;
        }
    }
}