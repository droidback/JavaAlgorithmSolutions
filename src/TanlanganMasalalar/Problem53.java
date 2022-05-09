package TanlanganMasalalar;

import java.util.Scanner;

public class Problem53{
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
        int rawIndex = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    rawIndex = i;
                }
            }
        }

        int[][] matrixNew = new int [m-1][n];
        int index=0;
        for (int i = 0; i < matrix.length; i++) {
            if (i != rawIndex) {
                matrixNew[index++] = matrix[i];
            }
        }

        for (int [] ints:matrixNew) {
            for (int anInts:ints) {
                System.out.print(anInts+" ");
            }
            System.out.println();
        }
    }
}