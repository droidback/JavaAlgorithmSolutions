package String;

import java.util.Scanner;

public class StringProblem49{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine().trim();
        char[] strCharArr = str.toCharArray();

        char lastElement = strCharArr[strCharArr.length-1];
        int i = str.length()-2;

        while (i >=0) {
            if (strCharArr[i + 1] == ' ' && strCharArr[i] != ' ') lastElement = strCharArr[i];
            else if (strCharArr[i] == lastElement){
                strCharArr[i]='.';
            }

            i--;
        }

        str = "";
        for (char word:strCharArr) {
            str = str.concat(String.valueOf(word));
        }
        System.out.println(str);
    }
}