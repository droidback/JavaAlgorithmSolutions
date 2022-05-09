package Matrix;

import java.util.Scanner;

public class MatrixProblem87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double max = Double.MIN_VALUE;
        int[][] a = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int k = 0; k <m; k++) {
            max=Double.MIN_VALUE;
            for (int i = 0; i < m - 1; i++) {
              // if (max<a[i][m - i - 2]){
                //   max=a[i][m-i-2];
               //}
                System.out.println(a[i][m-i-2]);
            }
          // System.out.println(max);
           // for (int i = k; i < m; i++) {

            //}
        }
    }
}
