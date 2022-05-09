package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        int k = 0;

        while (n >= 2) {
            n /= 2;
            k++;
        }
        System.out.println(k);
    }
}
