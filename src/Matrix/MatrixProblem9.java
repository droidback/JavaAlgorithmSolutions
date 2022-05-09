package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem9 {
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
        for (int [] ints:matrix) {
            System.out.println();
            for (int anInt: ints) {
                System.out.printf("%3s", anInt);
            }
        }
        System.out.println();
        for (int i = 1; i < matrix.length; i+=2) {
            System.out.println();
            for (int j = 0; j < matrix[i-1].length; j++) {
                System.out.printf("%3s",matrix[i][j]);
            }
        }

    }
}