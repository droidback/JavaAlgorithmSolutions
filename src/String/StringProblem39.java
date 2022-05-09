package String;

import java.util.Scanner;

public class StringProblem39{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.substring(str.indexOf(" ")).trim();
        str = str.substring(0,str.indexOf(" "));
        System.out.println(str);
    }
}