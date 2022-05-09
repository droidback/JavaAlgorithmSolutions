package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem21 {
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

        System.out.println("\n");
        double mean = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-1; j+=2) {
                    mean += matrix[i][j+1];
                    count++;
            }
            mean /= count;
            System.out.println("mean of matrix's odd elements: " + i + " = " + mean);
            mean = 0;
            count = 0;
        }

    }
}