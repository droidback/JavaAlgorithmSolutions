package Arrays;

import java.util.Scanner;

public class ArrayProblem44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]) System.out.println(a[i]+"=> "+i+";"+ j);
            }
        }
    }
}
