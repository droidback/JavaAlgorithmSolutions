package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();

        while (n >= 3) {
            n -= 3;
        }
        if (n == 0) System.out.println("3 ni darajasi");
        else System.out.println("3 ni darajasi emas");
    }
}
