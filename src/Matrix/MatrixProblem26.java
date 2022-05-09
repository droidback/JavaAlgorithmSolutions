package Matrix;

import java.util.Scanner;

public class MatrixProblem26 {
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
        int multiplication;
        int max = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            multiplication = 1;
            for (int j = 0; j < m; j++) {
                multiplication *= a[j][i];
            }
            if (max > multiplication) {
                max = multiplication;
                index = i + 1;
            }
        }
        System.out.println(max + "  " + index);
    }
}