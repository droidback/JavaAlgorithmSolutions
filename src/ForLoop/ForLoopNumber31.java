package ForLoop;

import java.util.Scanner;

public class ForLoopNumber31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        double a = 2.0;

        for (int i = 1; i <= n; i++) {
            a = 2 + 1.0 / a;
            System.out.printf("%.5s ",a);
        }
    }
}
