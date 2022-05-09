package ForLoop;

import java.util.Scanner;

public class ForLoopNumber20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scn.nextInt();
        int factorial = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += factorial *= i;
        }
        System.out.println(sum);
    }
}
