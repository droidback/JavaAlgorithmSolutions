package String;

import java.util.Scanner;

public class StringProblem20{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] s = str.toCharArray();
        boolean isDigit = false;

        for (int i = 0; (i < s.length) && ('0' <= s[i] && s[i] <= '9'); i++) {
            if (i == s.length - 1) isDigit = true;
        }

        if (isDigit){
            for (int i = s.length-1; i >=0; i--) {
                System.out.print(s[i]+" ");
            }
        }
    }
}