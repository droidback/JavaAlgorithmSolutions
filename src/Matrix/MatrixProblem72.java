package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(6);
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");

        int index = 0, count = 0, index2 = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] > 0) {
                    index = i;
                    index2 = j;
                    count++;
                }
            }
        }
        if (count == m && index2 != 0) {
            for (int j = 0; j < m; j++) {
                for (int l = n - 1; l >= index; l--) {
                    matrix[j][l] = matrix[j][l - 1];
                }
                matrix[j][index - 1] = 1;
            }
        }

        for (int[] ints : matrix) {
            for (int anInts : ints) {
                System.out.printf("%3s", anInts);
            }
            System.out.println();
        }
    }
}