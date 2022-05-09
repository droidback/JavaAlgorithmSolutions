package ForLoop;

import java.util.Scanner;

public class ForLoopNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
