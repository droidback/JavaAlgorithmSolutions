package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixProblem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (j + 1) * 5;
            }
        }

        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}