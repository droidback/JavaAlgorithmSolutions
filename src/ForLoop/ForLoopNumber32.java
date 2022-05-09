package ForLoop;

import java.util.Scanner;

public class ForLoopNumber32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        double a =1.0;
        for (int i = 1; i <= n; i++) {
            a =(a+1)/i;

            System.out.printf("%.3s ",a);
        }
    }
}
