package ForLoop;

import java.util.Scanner;

public class ForLoopNumber7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and b that you want summarize: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;

        for (int i = a + 1; i < b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
