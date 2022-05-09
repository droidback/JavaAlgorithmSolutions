package ForLoop;

import java.util.Scanner;

public class ForLoopNumber26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x (|x|<1) and n: ");

        float x = scan.nextFloat();
        int n = scan.nextInt();

        float sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (Math.pow(-1, i) * Math.pow(x, 2 * i + 1)) / (2 * i + 1);
        }
        System.out.printf("%.4f", sum);
    }
}
