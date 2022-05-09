package Matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixProblem54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(4) - 3;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");
        int raw = 0, col = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] > 0) {
                    break;
                }
                col = j;
                raw = i;
            }
            if (col == m - 1) {
                break;
            }
        }

        if (col == m - 1) {
            for (int j = 0; j < m; j++) {
                matrix[j][raw] = matrix[j][raw] + matrix[j][n-1];
                matrix[j][n-1] = matrix[j][raw] - matrix[j][n-1];
                matrix[j][raw] = matrix[j][raw] - matrix[j][n-1];
            }
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
