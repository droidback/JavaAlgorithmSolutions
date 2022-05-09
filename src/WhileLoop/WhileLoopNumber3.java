package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n and k");

        int n = scan.nextInt();
        int k = scan.nextInt();

        int i = 0;
        while (n >= k) {
            n = n - k;
            i++;
        }
        System.out.println(n);
        System.out.println(i);
    }
}
