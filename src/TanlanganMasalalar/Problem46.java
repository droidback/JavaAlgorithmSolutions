package TanlanganMasalalar;

import java.util.Scanner;

public class Problem46{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n= scan.nextInt();
        int [][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]= scan.nextInt();
            }
        }

        for (int[] ints : matrix) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            System.out.print(sum+" ");
        }
    }
}