package String;

import java.util.Scanner;

public class StringProblem8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char sign = scan.next().charAt(0);
        for (int i = 0; i < n; i++) {
            System.out.printf("%2s",sign);
        }
    }
}