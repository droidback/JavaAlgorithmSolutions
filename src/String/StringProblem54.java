package String;

import java.util.Scanner;

public class StringProblem54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        int count = 0, i = 0;
        while (i < str.length()) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') count++;
            i++;
        }

        System.out.println(count);
    }
}