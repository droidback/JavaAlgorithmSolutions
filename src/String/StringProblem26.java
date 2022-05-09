package String;

import java.util.Scanner;

public class StringProblem26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str2 = ".";
        int n = scan.nextInt();
        if (str.length() > n) {
            str = str.substring(str.length() - n);
            System.out.println(str);
        } else {
            for (int i = 2; i <= n - str.length(); i++) {
                str2 = str2.concat(".");
            }
            str2 = str2.concat(str);
            System.out.println(str2);
        }

    }
}