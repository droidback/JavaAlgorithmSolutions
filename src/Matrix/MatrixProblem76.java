package Matrix;

import java.util.Scanner;

public class MatrixProblem76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = 0;
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if (a[j][i]>a[j+1][i]){
                    
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
