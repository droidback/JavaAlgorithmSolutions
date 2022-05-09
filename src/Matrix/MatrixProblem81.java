package Matrix;

import java.util.Random;
import java.util.Scanner;

/**
 * @created by Shohruh
 * date 13.Dec.2021; time: 15:43
 * @company: EPAM
 */
public class MatrixProblem81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int m = scan.nextInt();

        int[][] matrix = new int[m][m];

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
        double sum = 0;
        for (int i = 0; i < m; ++i) {
            sum += matrix[i][m - i - 1];
        }

        sum /= m;
        System.out.println(sum);
    }
}
