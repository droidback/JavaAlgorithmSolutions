package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        int reverse = 0;
        int temp;
        while (n > 0) {
            temp = n % 10;
            reverse = reverse * 10 + temp;

            n /= 10;
        }
        System.out.println(reverse);
    }
}
