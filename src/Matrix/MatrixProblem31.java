package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");

        int allSum = 0;
        double allMean = (double) allSum / (matrix.length * matrix[0].length);
        double rawSum, colSum = 0;
        double min = Double.MAX_VALUE;
        int rawIndex = 0, colIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            rawSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rawSum += matrix[i][j];
            }
            double temp = Math.abs(allMean - rawSum / matrix[i].length);
            if (temp < min) {
                min = temp;
                rawIndex = i;
            }
        }
        min = Double.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            colSum = 0;
            for (int[] ints : matrix) {
                colSum += ints[i];
            }
            double temp = Math.abs(allMean - colSum / matrix.length);
            if (temp < min) {
                min = temp;
                colIndex = i;
            }
        }
        System.out.println(rawIndex + "  " + colIndex);
    }
}