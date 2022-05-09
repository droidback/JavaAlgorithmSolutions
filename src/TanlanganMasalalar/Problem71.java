package TanlanganMasalalar;

import java.util.Scanner;

public class Problem71{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println(sumColumn(matrix, k));
    }

    static int sumColumn(int[][] a, int k) {
        if (a[0].length < k) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][k];
            }
            return sum;
        }
    }
}