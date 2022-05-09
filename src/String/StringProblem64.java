package String;

import java.util.Scanner;

public class StringProblem64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int openBrackets = 0, closedbrackets = 0;
        boolean isError = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                openBrackets++;
            } else if (str.charAt(i) == ')') {
                closedbrackets++;
            }

            if (openBrackets < closedbrackets){
                System.out.println(i);
                isError=true;
            }
        }

        if(!isError){
            if(closedbrackets!=openBrackets){
                System.out.println(-1);
            } else{
                System.out.println(0);
            }
        }
    }
}