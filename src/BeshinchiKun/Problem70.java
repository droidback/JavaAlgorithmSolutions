package BeshinchiKun;

import java.util.Scanner;

public class Problem70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int k = scan.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println(sumRaw(matrix, k));
    }

    static int sumRaw(int[][] a, int k) {
        if (a.length < k) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < a[0].length; i++) {
                sum += a[k][i];
            }
            return sum;
        }
    }
}