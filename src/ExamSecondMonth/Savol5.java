package ExamSecondMonth;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 12.Dec.2021; time: 21:25
 * @company: EPAM
 */
public class Savol5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt(), n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

        System.out.println("\n");

        int lastElement = Integer.MIN_VALUE;
        label:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (lastElement < matrix[i][j]) {
                    lastElement = matrix[i][j];

                } else {
                    System.out.println("tartibni buzgan element "+matrix[i][j]);
                    break label;
                }
            }
        }

        if (lastElement == matrix[m - 1][n - 1]) {
            System.out.println("usish tartibida");
        }


        int lastElement2 = Integer.MIN_VALUE;
        label:
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (lastElement2 < matrix[i][j]) {
                    lastElement2 = matrix[i][j];

                } else {
                    System.out.println("tartibni buzgan element "+matrix[i][j]);
                    break label;
                }
            }
        }

        if (lastElement == matrix[0][0]) {
            System.out.println("kamayish tartibida");
        }

    }
}
