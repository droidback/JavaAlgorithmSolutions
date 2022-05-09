package FunSimple;

import java.util.Scanner;

public class FunSimple31 {
    public static boolean isPalindrome(int number) {
        int temp = number;
        int temp2 = number;
        number = 0;
        while (temp != 0) {
            number = number * 10 + temp % 10;
            temp /= 10;
        }
        return temp2 == number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int number = scan.nextInt();
            System.out.println(isPalindrome(number));
        }
    }
}
