package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem83 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");
        int sum;
        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += matrix[j][i - j];
                System.out.printf("%3s",matrix[j][i - j]);
            }
            System.out.print(" =>sum: "+sum+"\n");
        }

        for (int i = 1; i < m; i++) {
            sum = 0;
            for (int j = i; j < m; j++) {
                sum += matrix[j][m - 1 - j + i];
                System.out.printf("%3s",matrix[m - 1 - j + i][j]);
            }
            System.out.print(" =>sum: " + sum+"\n");
        }
    }
}
