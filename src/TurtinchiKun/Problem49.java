package TurtinchiKun;

import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int max;
        for (int i = 0; i < m; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
            matrix[i][n] = max;
        }

        for (int[] a : matrix) {
            for (int elem:a) {
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}