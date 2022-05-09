package TanlanganMasalalar;

import java.util.Scanner;

public class Problem47{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n= scan.nextInt();
        int [][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]= scan.nextInt();
            }
        }

        System.out.println("\n");
        int multiplication = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                multiplication *= matrix[j][i];
            }
            System.out.println("multiplication of column " + i + " = " + multiplication);
            multiplication = 1;
        }
    }
}