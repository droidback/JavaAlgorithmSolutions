package ForLoop;

import java.util.Scanner;

public class ForLoopNumber30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter A, B (B-A) and n: ");

        float a = scan.nextFloat();
        float b = scan.nextFloat();
        int n = scan.nextInt();

        float h = (b - a) / n;


        for (int i = 0; i <= n; i++) {
            float dot = a + i * h;
            System.out.println("x = " + dot);
            System.out.print("F(" + dot + ")=1-sin(" + dot + ") = ");
            System.out.printf("%.3f", (1 - Math.sin(dot)));
            System.out.println();
        }
    }
}
