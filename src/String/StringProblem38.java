package String;

import java.util.Scanner;

public class StringProblem38{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter str: ");
        String str = scan.next();
        System.out.println("enter s1: ");
        String s1 = scan.next();
        System.out.println("enter s2: ");
        String s2 = scan.next();

        str = str.replaceAll(s1,s2);
        System.out.println(str);
    }
}