package String;

import java.util.Scanner;

public class StringProblem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i != str.length() - 1) {
                for (int j = 0; j < 1; j++) {
                    System.out.print(" ");
                }
            }
        }
    }
}