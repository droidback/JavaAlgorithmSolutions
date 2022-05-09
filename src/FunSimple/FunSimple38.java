package FunSimple;

import java.util.Scanner;

public class FunSimple38 {
    public static float Power2(float a, int n) {
        float temp = 1;
        for (int i = 1; i <= Math.abs(n); ++i) {
            temp *= a;
        }
        return n < 0 ? 1 / temp : temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a;
        System.out.print("A:");
        a = scan.nextFloat();
        int k, l, m;
        System.out.print("K: ");
        k = scan.nextInt();
        System.out.print("L: ");
        l = scan.nextInt();
        System.out.print("M: ");
        m = scan.nextInt();

        System.out.printf("%.2f %n", Power2(a, k));
        System.out.printf("%.2f %n", Power2(a, l));
        System.out.printf("%.2f %n", Power2(a, m));
    }
}
