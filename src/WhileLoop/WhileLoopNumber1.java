package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and b that (a > b): ");

        int a = scan.nextInt();
        int b = scan.nextInt();

        while (a >= b) {
            a = a - b;
        }
        System.out.println(a);
    }
}
