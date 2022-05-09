package String;

import java.util.Scanner;

public class StringProblem31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String s0 = scan.next();
        boolean isNotContains = true;
        if (str.length() >= s0.length()) {
            label:
            for (int i = 0; i < str.length(); i ++) {

                for (int j = 0; j < s0.length(); j++) {

                    if (str.charAt(i + j) != s0.charAt(j)) break;
                    else if (j == s0.length() - 1) {
                        System.out.println("True");
                        isNotContains = false;
                        break label;
                    }

                }

            }
            if(isNotContains) System.out.println("False");
        }

    }
}