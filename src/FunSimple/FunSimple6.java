package FunSimple;

import java.util.Scanner;

public class FunSimple6 {
    public static void DigitCountSum(int number) {
        int count = 0;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            count++;
            number /= 10;
        }
        System.out.println("quantity of numbers: " + count);
        System.out.println("sum: " + sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter number: ");
            int number = scan.nextInt();
            DigitCountSum(number);
        }


    }
}
