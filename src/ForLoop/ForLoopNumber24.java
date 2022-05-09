package ForLoop;

import java.util.Scanner;

public class ForLoopNumber24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x and n: ");

        float x = scan.nextFloat();
        int n = scan.nextInt();

        float factorial = 1;
        float sum = 0;
        float count;

        for (int i = 0; i < n; i++) {
            count = 2 * i;
            for (int j = 1; j <= count; j++) {
                factorial *= j;
            }
            sum += (Math.pow(-1, i) * Math.pow(x, 2 * i)) / factorial;
        }

        System.out.printf("%.2f", sum);
    }
}
