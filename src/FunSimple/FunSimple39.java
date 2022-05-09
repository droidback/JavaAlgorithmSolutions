package FunSimple;

import java.util.Scanner;

public class FunSimple39 {
    public static double Power1(double a, double b) {
        return (a <= 0 ? 0 : Math.exp(b * Math.log(a)));
    }

    public static double Power2(double a, int n) {
        float temp = 1;
        for(int i = 1; i <= Math.abs(n); ++i) {
            temp *= a;
        }
        return n < 0 ? 1 / temp : temp;
    }

    public static double Power3(double a, double b) {
        if((b % 1) == 0) {
            return Power2(a, (int)b);
        } else {
            return Power1(a, b);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double p, a, b, c;
        System.out.print("P:");
        p = scan.nextFloat();
        System.out.print("A: ");
        a = scan.nextFloat();
        System.out.print("B: ");
        b = scan.nextFloat();
        System.out.print("C: ");
        c = scan.nextFloat();

        System.out.printf("%f %n", Power3(a, p));
        System.out.printf("%f %n", Power3(b, p));
        System.out.printf("%f %n", Power3(c, p));
    }
}
