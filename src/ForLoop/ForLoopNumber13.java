package ForLoop;

import java.util.Scanner;

public class ForLoopNumber13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        float sum = 0;
        int j = 0;

        for (float i = 1.1f; j < n; i += 0.1f) {
            sum += Math.pow((-1), j) * i;
            j++;
        }
        System.out.printf("%.2f", sum);
    }
}
