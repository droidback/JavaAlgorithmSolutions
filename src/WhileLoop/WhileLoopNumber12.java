package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int k = 0;
        int summa = 0;

        while (summa <= n) {
            summa += ++k;
        }
        System.out.println(k-1);
        System.out.println(summa-k);
    }
}
