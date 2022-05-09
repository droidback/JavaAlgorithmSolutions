package FunSimple;

import java.util.Scanner;

public class FunSimple48 {
    public static int Gcd(int a, int b) {
        while ((a != 0) && (b != 0)) {
            if (a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }

    public static int Lcm(int a, int b) {
        return a * (b / Gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        System.out.println(Lcm(a, b));
        System.out.println(Lcm(a, c));
        System.out.println(Lcm(a, d));
    }
}
