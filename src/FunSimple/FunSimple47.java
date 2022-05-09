package FunSimple;

import java.util.Scanner;

public class FunSimple47 {
    public static int Gcd(int a, int b) {
        while ((a != 0) && (b != 0)) {
            if (a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }

    public static void Frac1(int a, int b, int p, int q) {
        p = a / Gcd(a, b);
        q = b / Gcd(a, b);
        System.out.println(p);
        System.out.println(q);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, result1, result2;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        e = scan.nextInt();
        f = scan.nextInt();
        g = scan.nextInt();
        h = scan.nextInt();
        result1 = scan.nextInt();
        result2 = scan.nextInt();

        Frac1(a * b + c * b, b * d, result1, result2);
        System.out.println(result1 + "/" + result2);
        Frac1(a * f + e * b, b * f, result1, result2);
        System.out.println(result1 + "/" + result2);
        Frac1(a * h + g * b, b * h, result1, result2);
        System.out.println(result1 + "/" + result2);
    }
}
