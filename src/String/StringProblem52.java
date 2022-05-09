package String;

import java.util.Scanner;

public class StringProblem52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim().replaceAll("\\s+", " ");
        String[] strArr = str.split(" ");

        str = "";
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
            str = str.concat(strArr[i] + " ");
            if (i == strArr.length - 1) str = str.trim();
        }

        System.out.println(str);
    }
}