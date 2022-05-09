package ForLoop;

import java.util.Scanner;

public class ForLoopNumber11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and n: ");
        int a = scan.nextInt();
        int n = scan.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.pow((a + i), 2);
        }
        System.out.print(sum);
    }
}
