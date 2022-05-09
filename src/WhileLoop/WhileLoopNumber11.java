package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int k = 0;
        int summa = 0;

        while (summa < n) {
            k++;
            summa += k;
        }
        System.out.println(k);
        System.out.println(summa);
    }
}
