package Matrix;

import java.util.Scanner;

public class MatrixProblem86 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        double min=Double.MAX_VALUE;
        int [][]a=new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        for (int i = 1; i < m; i++) {
            min=Double.MAX_VALUE;
            for (int j = i; j < m; j++) {
                if (min>a[j-i][j]){
                    min=a[j-i][j];
                }
            }
            System.out.println(min);
            min=Double.MAX_VALUE;
            for (int j = i; j <m ; j++) {
                if (min>a[j][j-i]){
                    min=a[j][j-i];
                }
            }
            System.out.println(min);
        }
    }
}
