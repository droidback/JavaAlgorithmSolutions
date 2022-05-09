package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(6) - 3;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");
        int line;
        for (int i = 0; i < m; i++) {
            line = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 0) line = j;
            }

            if (line == n - 1) {
                System.out.println(i);
            } else System.out.println("there is no such a line");

        }
    }
}