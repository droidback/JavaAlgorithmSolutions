package FunSimple;

import java.util.Scanner;

public class FunSimple49 {
    public static int Gcp(int a, int b) {
        while (b != 0) {
            int c = a;
            a = b;
            b = c % b;
        }
        return a;
    }

    public static void Func(int a, int b, int c) {
        a = Gcp(Gcp(a, b), c);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        Func(a, b, c);
        Func(a, c, d);
        Func(b, c, d);
    }
}
