package String;

import java.util.Scanner;

public class StringProblem17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] strArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (65 <= str.charAt(i) && str.charAt(i) <= 90) {
                strArray[i] = (char) (str.charAt(i) + 32);
            }
        }
        str = "";
        for (char c : strArray) {
            str = str.concat(String.valueOf(c));
        }
        System.out.println(str);
    }
}