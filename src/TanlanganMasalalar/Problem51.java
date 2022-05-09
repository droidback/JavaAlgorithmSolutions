package TanlanganMasalalar;

import java.util.Scanner;

public class Problem51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        int rawIndex = 0, colIndex = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    rawIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.println(rawIndex + " " + colIndex);
    }
}