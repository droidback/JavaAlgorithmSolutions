package Matrix;

import java.util.Scanner;

public class MatrixProblem96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <m; i++) {
            for (int j = i; j <m-i ; j++) {
                a[j][i]=0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
