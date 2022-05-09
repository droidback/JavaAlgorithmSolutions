package ForLoop;

import java.util.Scanner;

public class ForLoopNumber21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int factorial = 1;
        double sum = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            sum = sum + 1.0 / factorial;
        }

        System.out.println(sum);
    }
}
