package ForLoop;

import java.util.Scanner;

public class ForLoopNumber25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x (|x|<1) and n: ");

        float x = scan.nextFloat();
        int n = scan.nextInt();

        float sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(-1, i - 1) * Math.pow(x, i) / i;
        }
        System.out.printf("%.5f", sum);
    }
}
