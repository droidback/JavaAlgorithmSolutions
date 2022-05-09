package ForLoop;

import java.util.Scanner;

public class ForLoopNumber29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter A, B (B-A) and n: ");

        float a = scan.nextFloat();
        float b = scan.nextFloat();
        int n = scan.nextInt();

        float h = (b - a) / 2;


        for (int i = 1; i <= n; i++) {
            System.out.println(a + i * h);
        }
    }
}
