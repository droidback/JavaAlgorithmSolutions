package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(6)-3;
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");
        int positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) positiveCount++;
                else if (matrix[i][j] < 0) negativeCount++;
            }
            if (negativeCount == positiveCount) {
                System.out.println(i);
                break;
            } else if(i== matrix.length-1){
                System.out.println("Bunday massiv yo'q!");
            }
            negativeCount =0;
            positiveCount=0;
        }
    }
}