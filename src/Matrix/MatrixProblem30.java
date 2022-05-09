package Matrix;

import java.util.Scanner;

public class MatrixProblem30 {
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
        double mean, sum;
        int count;
        for (int i = 0; i < n; i++) {
            sum = 0;
            count = 0;
            for (int j = 0; j < m; j++) {
                sum += a[j][i];
            }
            mean = sum / n;
            for (int j = 0; j < n; j++) {
                if (mean < a[j][i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}