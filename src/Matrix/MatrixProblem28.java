package Matrix;

import java.util.Scanner;

public class MatrixProblem28 {
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
                sum += a[j][i];
            }
            if (max < sum) {
                min = Integer.MIN_VALUE;
                for (int j = 0; j < m; j++) {
                    if (min < a[j][i]) {
                        min = a[j][i];
                    }
                }
                max = sum;
            }
        }
        System.out.println(min);
    }
}