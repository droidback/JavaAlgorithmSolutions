package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2) + 1;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");

        boolean isBreak;
        int count = 0;
        for (int i = n - 2; i >= 0; i--) {
            isBreak = true;
            for (int j = m-1; j >=0; j--) {
                if (matrix[j][n-1] != matrix[j][i] && isBreak) {
                    count++;
                    isBreak = false;
                }
            }
        }

        System.out.println("Oxirgi ustunga uxshash ustunlar soni: " + (n - 1 - count) + " ta");
    }
}