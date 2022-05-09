package FunSimple;

import java.util.Scanner;

public class FunSimple28 {
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= number / i; i++)
        {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter k: ");
        int k = scan.nextInt();
        int count = 0;
        for (int i = 0; i < k; i++) {
            int number = scan.nextInt();
            if (isPrime(number)) count++;
        }
        System.out.println(count);
    }
}
