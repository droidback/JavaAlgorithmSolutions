package FunSimple;

import java.util.Scanner;

public class FunSimple21 {
    public static int SumRange(int a, int b) {
        int sum = 0;
        for (int i = a + 1; i < b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            if (number1 > number2) System.out.println(0);
            else System.out.println(SumRange(number1, number2));
        }
    }
}
