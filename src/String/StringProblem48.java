package String;


import java.util.Scanner;

public class StringProblem48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine().trim();
        char[] strCharArr = str.toCharArray();

        char firstElement = strCharArr[0];
        int i = 1;

        while (i < str.length()) {
            if (strCharArr[i - 1] == ' ' && strCharArr[i] != ' ') {
                firstElement = strCharArr[i];
            }
            else if (strCharArr[i] == firstElement){
                strCharArr[i]='.';
            }

            i++;
        }

        str = "";
        for (char word:strCharArr) {
            str = str.concat(String.valueOf(word));
        }
        System.out.println(str);
    }
}