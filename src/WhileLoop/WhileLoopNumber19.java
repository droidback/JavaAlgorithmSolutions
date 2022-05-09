package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        int summa = 0;
        int temp;
        int k =0;
        while (n > 0) {
            temp = n % 10;
            summa += temp;
            n /= 10;
            k++;
        }
        System.out.println(summa);
        System.out.println(k);
    }
}
