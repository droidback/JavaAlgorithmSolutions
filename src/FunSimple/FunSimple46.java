package FunSimple;

import java.util.Scanner;

public class FunSimple46 {
    public static int Gcd(int a, int b) {
        if (a == 0) return b;
        return Gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int a = scan.nextInt();
            System.out.println(Gcd(a, scan.nextInt()));
        }
    }
}
