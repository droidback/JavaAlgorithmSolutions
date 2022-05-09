package BeshinchiKun;

import java.util.Scanner;


public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("EKUB " + a);
    }
}
