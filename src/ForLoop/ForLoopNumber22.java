package ForLoop;

import java.util.Scanner;

public class ForLoopNumber22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x and n: ");

        float x = scan.nextFloat();
        int n = scan.nextInt();

        float factorial = 1;
        float sum = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += Math.pow(x, i) / factorial;
        }

        System.out.printf("%.2f", sum);
    }
}
