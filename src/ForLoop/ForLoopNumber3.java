package ForLoop;

import java.util.Scanner;

public class ForLoopNumber3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a and b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (int i = b; i >= a; i--) {
            System.out.println(i);
        }
    }
}
