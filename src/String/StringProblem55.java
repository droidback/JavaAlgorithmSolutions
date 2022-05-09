package String;

import java.util.Scanner;

public class StringProblem55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        String[] strArr = str.replaceAll("\\s+", " ").split(" ");
        int max = Integer.MIN_VALUE, index = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > max) {
                max = strArr[i].length();
                index = i;
            }
        }
        System.out.println(strArr[index]);

    }
}