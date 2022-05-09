package Arrays;

import java.util.Scanner;

public class ArrayProblem48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int numMax = 0;
        for (int i = 0; i < a.length; i++) {
            int num = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) num++;
            }
            if (num > numMax) numMax = num;
        }
        System.out.println(numMax);
    }
}
