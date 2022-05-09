package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem39 {
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
        for (int i = 0; i < n; i++) {
            isBreak = false;
            for (int j = 0; j < m - 1; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (matrix[j][i] == matrix[k][i] && !isBreak) {
                        count++;
                        isBreak = true;
                    }
                }
            }
        }

        System.out.println(n - count);
    }
}