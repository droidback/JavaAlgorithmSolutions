package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem36 {
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
        int line = 0, count =0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == matrix[i + 1][j]) {
                    line++;
                }
            }
            if(line == m){
                count++;
            }
            line = 0;
        }
        System.out.println(count);
    }
}