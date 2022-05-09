package ForLoop;

import java.util.Scanner;

public class ForLoopNumber9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;

        for (int i = a + 1; i < b; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
