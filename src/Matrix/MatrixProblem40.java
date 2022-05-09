package Matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixProblem40{
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
        int count, maxCount = Integer.MIN_VALUE, index = 0;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                count = 0;
                for (int k = j + 1; k < n; k++) {
                    if (matrix[i][j] == matrix[i][k]) count++;
                }
                if (maxCount <= count) {
                    maxCount = count;
                    index = i;
                }
            }
        }
        System.out.println(Arrays.toString(matrix[index]));
    }
}