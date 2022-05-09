package String;

import java.util.Scanner;

public class StringProblem33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String s0 = scan.next();

        if (str.contains(s0)) {
            char[] strCharArr = str.toCharArray();
            char[] strCharArrRemoved = new char[strCharArr.length - s0.length()];
            int t = 0, count = 0;
            label:
            for (int i = 0; i < strCharArr.length; i++) {
                for (int j = 0; j < s0.length(); j++) {

                    if (strCharArr.length > i + j && str.charAt(i + j) != s0.charAt(j)) break;
                    else if (strCharArr.length > i + j && j == s0.length() - 1) {
                        count++;
                    }
                }
                if (count == 1) {
                    for (int j = 0; j < str.length(); j++) {

                        if (j != i) {
                            strCharArrRemoved[t] = strCharArr[j];
                            t++;
                        } else {
                            j += s0.length() - 1;
                        }

                        if (j == str.length() - 1) {
                            break label;
                        }
                    }
                }
            }
            str = String.copyValueOf(strCharArrRemoved);
            System.out.println(str);
        }
    }
}