package String;

import java.util.Scanner;

public class StringProblem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i != str.length() - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}