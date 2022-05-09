package String;

import java.util.Scanner;

public class StringProblem51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("your line should be only in 'lower case' or 'upper case': ");
        String str = scan.nextLine().trim();
        String[] strArr = str.replaceAll("\\s+", " ").split(" ");
        String temp;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }

        str = "";
        for (String word : strArr) {
            str = str.concat(word + " ");
            if (word.equals(strArr[strArr.length - 1])) str = str.trim();
        }
        System.out.println(str);
    }
}