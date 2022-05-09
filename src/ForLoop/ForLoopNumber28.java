package ForLoop;

import java.util.Scanner;

public class ForLoopNumber28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x (|x|<1) and n: ");

        float x = scan.nextFloat();
        int n = scan.nextInt();

        float sum = 1;

        for (int i = 1; i <= n; i++) {
            sum += (Math.pow(-1, i) * (2 * i - 3) * x) / (2 * i);
        }
        System.out.printf("%.4f", sum);
    }
}
