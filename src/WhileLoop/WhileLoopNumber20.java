package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        while (n > 0 && (n % 10) != 2) {
            n /= 10;
        }
        if (n > 0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
