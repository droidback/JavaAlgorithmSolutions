package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixProblem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n];
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
        }
        int q = scan.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = b[i] * (int) Math.pow(q, j);
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%5s", anInt);
            }
            System.out.println();
        }
    }
}