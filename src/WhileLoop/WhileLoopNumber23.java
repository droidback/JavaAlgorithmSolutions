package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and b: ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        while ((a != 0) & (b != 0)) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        System.out.println(a+b);
    }
}
