package String;

import java.util.Scanner;

public class StringProblem35{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String s0 = scan.next();

        if(str.contains(s0)){
            str = str.replaceAll(s0,"");
            System.out.println(str);
        } else System.out.println("str is not contain s0");
    }
}