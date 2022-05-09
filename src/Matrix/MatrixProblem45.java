package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem45 {
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

        boolean isBreak, isIncrease;
        boolean isNot = true;

        for (int i = 0; i < n; i++) {
            isBreak = true;
            isIncrease = matrix[0][i] < matrix[1][i];
            if (isIncrease) {
                for (int j = 0; j < m - 1; j++) {
                    if (matrix[j][i] >= matrix[j + 1][i] && isBreak) {
                        isBreak = false;
                    }
                    if (j == m - 2 && isBreak) {
                        System.out.println(i + "-index: " + matrix[j][0]);
                        isNot = false;
                    }
                }
            } else {
                for (int j = 0; j < m - 1; j++) {
                    if (matrix[j][i] <= matrix[j + 1][i] && isBreak) {
                        isBreak = false;
                    }
                    if (j == m - 2 && isBreak) {
                        System.out.println(i + "-index: " + matrix[m - 1][i]);
                        isNot = false;
                    }
                }
            }
        }
        if (isNot) {
            System.out.println(0);
        }
    }
}