package String;

import java.util.Scanner;

public class StringProblem19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] s = str.toCharArray();

        byte index = 0;
        if (s[0] == '-') index = 1;
        boolean isInt = true;
        boolean isDouble = true;
        int dotsCount = 0;

        for (int i = index; i < s.length; i++) {

            if (s[i] > '9' || s[i] < '0') isInt = false;

            if (i == index)if (!Character.isDigit(s[i])) isDouble = false;
            else {
                if (s[i] == '.') dotsCount++;
                else if (s[i] > '9' || s[i] < '0') isDouble = false;
            }
        }

        if (dotsCount > 1) isDouble = false;

        if (isInt) System.out.println(1);
        else if (isDouble) System.out.println(2);
        else System.out.println(0);
    }
}