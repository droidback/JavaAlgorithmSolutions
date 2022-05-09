package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and b that (a > b): ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int k = 0;

        while (a >= b) {
            a = a - b;
            k++;
        }
        System.out.println(k);
    }
}
