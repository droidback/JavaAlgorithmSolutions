package ForLoop;

import java.util.Scanner;

public class ForLoopNumber8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 1;

        for (int i = a + 1; i < b; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
