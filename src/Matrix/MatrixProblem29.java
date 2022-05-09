package Matrix;

import java.util.Scanner;

public class MatrixProblem29 {
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
        double sum, mean;
        int count;
        for (int i = 0; i < m; i++) {
            sum = 0;
            count = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            mean = sum / n;
            for (int j = 0; j < n; j++) {
                if (mean > a[i][j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}