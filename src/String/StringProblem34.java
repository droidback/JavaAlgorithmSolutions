package String;

import java.util.Scanner;

public class StringProblem34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String s0 = scan.next();

        if (str.contains(s0)) {
            str = reverse(str);
            s0 = reverse(s0);
            str = str.replaceFirst(s0, "");
            str = reverse(str);
            System.out.println(str);
        }
    }

    public static String reverse(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
}