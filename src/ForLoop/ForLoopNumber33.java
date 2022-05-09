package ForLoop;

import java.util.Scanner;

public class ForLoopNumber33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        
        int previous = 1;
        int next = 1;
        int temp;
        for (int i = 3; i <= n; i++) {
            temp = previous + next;
            previous = next;
            next = temp;

            System.out.printf("\n%6s",temp);
        }
    }
}
