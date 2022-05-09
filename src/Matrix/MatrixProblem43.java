package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(12) + 1;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");

        int count = 0;
        boolean isBreak;
        for (int i = 0; i < m; i++) {
            isBreak = true;
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1] && isBreak) {
                    isBreak = false;
                    count++;
                }
            }
        }
        System.out.println(n - count);
    }
}