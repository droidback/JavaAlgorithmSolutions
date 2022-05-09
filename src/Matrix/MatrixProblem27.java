package Matrix;

import java.util.Scanner;

public class MatrixProblem27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int sum;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            if (min > sum) {
                max = Integer.MIN_VALUE;
                for (int j = 0; j < m; j++) {
                    if (max < a[i][j]) {
                        max = a[i][j];
                    }
                }
                min = sum;
            }
        }
        System.out.println(max);
    }
}