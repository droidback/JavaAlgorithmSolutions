package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        int factorial = 1;
        while (0 < n) {
            factorial *= n;
            n-=2;
        }
        System.out.println(factorial);
    }
}