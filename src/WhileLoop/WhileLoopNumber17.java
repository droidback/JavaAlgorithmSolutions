package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n amd m that n > m: ");

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k =0;
        while (n >= m) {
            n = n-m;
            k++;
        }
        System.out.println(k);
        System.out.println(n);
    }
}
