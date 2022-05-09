package BeshinchiKun;

import java.util.Scanner;

public class Problem45{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int ustun = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < ustun; j++) {
                System.out.print(matrix[i][j]+" ");
                if (j==ustun-1){
                    for (int k = i+1; k <matrix.length ; k++) {
                        System.out.print(matrix[k][j]+" ");
                    }
                    System.out.println();
                }
            }
            ustun--;
        }
    }
}