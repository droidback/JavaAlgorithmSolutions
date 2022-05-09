package Matrix;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MatrixProblem53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(12) -3;
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
                if (matrix[j][i] < 0) {
                    break;
                }
                col = j;
                raw = i;
            }
        }

        if (col == m - 1) {
            for (int j = 0; j < m; j++) {
                matrix[j][raw] = matrix[j][raw] + matrix[j][0];
                matrix[j][0] = matrix[j][raw] - matrix[j][0];
                matrix[j][raw] = matrix[j][raw] - matrix[j][0];
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
