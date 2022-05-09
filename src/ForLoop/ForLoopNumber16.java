package ForLoop;

import java.util.Scanner;

public class ForLoopNumber16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and n: ");

        double a = scan.nextDouble();
        int n = scan.nextInt();

        double result = 0.0;

        for (int i = 0; i < n; i++) {
            result = Math.pow(a, i);
            System.out.println(result);
        }
    }
}
