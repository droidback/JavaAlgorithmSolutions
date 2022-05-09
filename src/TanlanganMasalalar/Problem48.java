package TanlanganMasalalar;

import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int count, count2;
        for (int i = 0; i < m; i++) {
            count = 0; count2=0;
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]<0) count++;
                else if(matrix[i][j]>0)count2++;
            }
            if(count==count2){
                System.out.println(i+"-satr");
                break;
            } else if(i==m-1){
                System.out.println("bunday satr yo'q");
            }
        }
    }
}