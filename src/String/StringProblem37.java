package String;

import java.util.Scanner;

public class StringProblem37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String s1 = scan.next();
        String s2 = scan.next();

        if (str.contains(s1)) {
            str = reverse(str);
            s1 = reverse(s1);
            s2 = reverse(s2);
            str = str.replaceFirst(s1, s2);
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