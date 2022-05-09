package Arrays;

import java.util.Scanner;

public class ArrayProblem27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= scan.nextInt();
        }
        int number = a[1]/a[0];
        for (int i = 1; i < n; i++) {
            if(a[i]/a[i-1]>0){
                number = i;
                break;
            }
        }
        System.out.println(Math.max(number, 0));
    }
}
