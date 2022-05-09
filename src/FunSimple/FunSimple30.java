package FunSimple;

import java.util.Scanner;

public class FunSimple30 {
    public static int DigitN(int number, int n) {
        int i = 1;
        for (i = 1; i <= n - 1; i++) number /= 10;
        if (number != 0) return number % 10;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int number = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(DigitN(number, n));
        }
    }
}

