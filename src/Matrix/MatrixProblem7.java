package Matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixProblem7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n];
        int k = scan.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9) - 1;
            }
        }
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }

        for (int i = 0; i < matrix.length; i++) {
            if (i == k-1) {
                System.out.print("\n[  ");
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%-3s", matrix[i][j]);
                }
                System.out.println("]");
            }
        }
    }
}