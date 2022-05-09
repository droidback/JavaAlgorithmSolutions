package ForLoop;

import java.util.Scanner;

public class ForLoopNumber10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = scan.nextInt();
        double sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("%.3f", sum);
    }
}
