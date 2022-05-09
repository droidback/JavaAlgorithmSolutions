package Matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixProblem11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9) - 1;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            if ((i + 1) % 2 == 0) {
                for (int k = 1; k <= matrix[i].length / 2; k++) {
                    matrix[i][k - 1] = matrix[i][k - 1] + matrix[i][matrix[i].length - k];
                    matrix[i][matrix[i].length - k] = matrix[i][k - 1] - matrix[i][matrix[i].length - k];
                    matrix[i][k - 1] = matrix[i][k - 1] - matrix[i][matrix[i].length - k];
                }
            }
        }
        for (int [] ints:matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}