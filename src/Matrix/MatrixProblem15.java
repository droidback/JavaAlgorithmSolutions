package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixProblem15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int m = in.nextInt();
        int[][] matrix = new int[m][m];
        int son = 1, index = 0, j = 0;

        for (int i = 0; i <= m / 2; i++) {
            j = i;
            while (j < m - i - 1) {
                matrix[i][j] = son++;
                j++;
            }

            index = i;
            while (index < m - i - 1) {
                matrix[index][j] = son++;
                index++;
            }
            while (j > i) {
                matrix[index][j] = son++;
                j--;
            }
            while (index >= i + 1) {
                matrix[index][j] = son++;
                index--;
            }
        }

        if (m % 2 != 0) {
            matrix[index][j] = son;
        }


        for (int i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}