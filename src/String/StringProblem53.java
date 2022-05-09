package String;

import java.util.Scanner;

public class StringProblem53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        char[] strSymbolArr = {33, 34, 39, 40, 41, 44, 45, 46, 58, 59, 63};
        int count = 0, i = 0;
        while (i < str.length()) {

            for (char c : strSymbolArr) {
                if (str.charAt(i) == c) count++;
            }
            i++;
        }

        System.out.println(count);
    }
}