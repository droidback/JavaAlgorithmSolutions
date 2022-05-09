package String;

import java.util.Scanner;

public class StringProblem13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (48 <= str.charAt(i) && str.charAt(i) <= 57) count++;
        }

        System.out.println(count);
    }
}