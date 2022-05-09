package BeshinchiKun;

import java.util.Scanner;

public class Problem25 {
    static boolean isPalindrom(int n) {
        int temp = n;
        int end = 0;
        while (n != 0) {
            end = end * 10 + n % 10;
            n /= 10;
        }
        return end == temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, count = 0;
        for (int i = 0; i < 3; i++) {
            n = scan.nextInt();
            if (isPalindrom(n)) count++;
        }
        System.out.println(count);
    }
}