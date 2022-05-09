package String;

import java.util.Scanner;

public class StringProblem27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        String s1 = scan.next();

        int n2 = scan.nextInt();
        String s2 = scan.next();
        String result;

        if (s1.length() < n1 && s2.length() > n2) {
            result = s1 + s2.substring(s2.length() - n2);
        } else if (s2.length() < n2 && s1.length() > n1) {
            result = s1.substring(0, n1) + s2;
        } else if (s1.length() < n1 && s2.length() < n2) {
            result = s1 + s2;
        } else result = s1.substring(0, n1)+s2.substring(s2.length()-n2);

        System.out.println(result);

    }
}