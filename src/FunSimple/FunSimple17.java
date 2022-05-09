package FunSimple;

import java.util.Scanner;

public class FunSimple17 {
    public static int RootsCount(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            return 0;
        } else if (d == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        int answer = 0;
        for (int i = 1; i < 4; ++i) {
            System.out.println("enter A: ");
            a = scan.nextDouble();
            System.out.println("enter B: ");
            b = scan.nextDouble();
            System.out.println("enter C: ");
            c = scan.nextDouble();

            answer = RootsCount(a, b, c);
            System.out.println(answer);
        }
    }
}
