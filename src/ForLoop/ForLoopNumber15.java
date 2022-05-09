package ForLoop;

import java.util.Scanner;

public class ForLoopNumber15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and n: ");
        double a = scan.nextDouble();
        int n = scan.nextInt();
        double sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= a;
        }

        System.out.println(sum);
    }
}
