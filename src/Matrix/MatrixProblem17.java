package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

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
        int k = scan.nextInt();
        int sum = 0, multiplication = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (k == i) {
                    sum += matrix[i][j];
                    multiplication *= matrix[i][j];
                }
            }
        }
        System.out.println("sum: "+ sum);
        System.out.println("multiplication: "+multiplication);
    }
}