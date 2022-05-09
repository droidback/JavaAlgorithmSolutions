package String;

import java.util.Scanner;

public class StringProblem50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        String[] strArr = str.replaceAll("\\s+", " ").split(" ");

        str = "";
        for (int i = strArr.length - 1; i >= 0; i--) {
            str = str.concat(strArr[i] + " ");
            if (i == 0) str = str.trim();
        }
        System.out.println(str);
    }
}