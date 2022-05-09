package ForLoop;

import java.util.Scanner;

public class ForLoopNumber18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and n: ");

        double a = scan.nextDouble();
        int n = scan.nextInt();
        double s = 0;

        for (int i = 0; i < n; i++) {
            s += Math.pow((-1), i) * Math.pow(a, i);
        }

        System.out.println(s);
    }
}
