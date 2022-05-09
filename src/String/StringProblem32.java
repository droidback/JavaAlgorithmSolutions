package String;

import java.util.Scanner;

public class StringProblem32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll(" ","");
        String s0 = scan.next();
        int count = 0;

        if (str.length() >= s0.length()) {
            for (int i = 0; i < str.length(); i++) {

                for (int j = 0; j < s0.length(); j++) {

                    if (str.length() > i + j && str.charAt(i + j) != s0.charAt(j)) break;
                    else if (str.length() > i + j&&j == s0.length() - 1) {
                        count++;
                        i += j;
                    }

                }

            }
            System.out.println(count);
        }

    }
}