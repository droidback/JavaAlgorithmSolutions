package TanlanganMasalalar;

import java.util.Scanner;

public class Problem52{
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
        int colIndex = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }
        }

        int[][] matrixNew = new int [m][n-1];
        int index, index2=0;
        for (int i = 0; i < matrix.length; i++) {
            index=0;
            for (int j = 0; j < matrix.length; j++) {
                if (j != colIndex) {
                    matrixNew[index2][index++] = matrix[i][j];
                }
            }
            index2++;

        }

        for (int [] ints:matrixNew) {
            for (int anInts:ints) {
                System.out.print(anInts+" ");
            }
            System.out.println();
        }
    }
}