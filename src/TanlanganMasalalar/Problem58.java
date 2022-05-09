package TanlanganMasalalar;

import java.util.Scanner;

public class Problem58{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
//        char[] strCharArr = str.toCharArray();
//        String result = "";
//        boolean isSpace = false;
//
//        int count = 0;
//        for (char c : strCharArr) {
//
//            if (c == ' ') {
//                isSpace = true;
//            } else {
//                if (isSpace) {
//                    if (count != 0)
//                        result += " ";
//                    isSpace = false;
//                }
//                count++;
//                result += c;
//            }
//        }
//        System.out.println(result);
        str = str.replaceAll("\\s+"," ").trim();
        System.out.println(str);

    }
}