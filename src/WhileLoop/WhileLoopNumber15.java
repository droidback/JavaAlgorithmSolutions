package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter S so'm: ");
        double s = scan.nextDouble();

        System.out.println("enter p that 0<p<12: ");
        double p = scan.nextDouble();

        double summa = s;
        int k = 0;
        while (summa <= 2 * s) {
            k++;
            summa += (summa * p) / 100.0;
        }

        System.out.println(k);
        System.out.println(summa);

    }
}
