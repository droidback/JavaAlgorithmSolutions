package ForLoop;

import java.util.Scanner;

public class ForLoopNumber39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter A and B (A < B): ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d ",i);
            }
        }
    }
}
