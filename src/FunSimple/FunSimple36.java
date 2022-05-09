package FunSimple;

import java.util.Scanner;

public class FunSimple36 {
    public static int Fib(int number) {
        int fk = 0, fk1 = 1, fk2 = 1;
        for (int i = 3; i <= number; ++i) {
            fk = fk2 + fk1;
            fk2 = fk1;
            fk1 = fk;
        }
        return fk;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            System.out.println(Fib(n));
        }
    }
}
