package Matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixProblem50 {
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

        int minIndex1 = 0, minIndex2 = 0, maxIndex1 = 0, maxIndex2 = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (min > matrix[j][i]) {
                    min = matrix[j][i];
                    minIndex1 = j;
                    minIndex2 = i;
                }
                if (max < matrix[j][i]) {
                    max = matrix[j][i];
                    maxIndex1 = j;
                    maxIndex2 = i;
                }
            }
        }
        matrix[maxIndex1][maxIndex2] = matrix[maxIndex1][maxIndex2] + matrix[minIndex1][minIndex2];
        matrix[minIndex1][minIndex2] = matrix[maxIndex1][maxIndex2] - matrix[minIndex1][minIndex2];
        matrix[maxIndex1][maxIndex2] = matrix[maxIndex1][maxIndex2] - matrix[minIndex1][minIndex2];

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
