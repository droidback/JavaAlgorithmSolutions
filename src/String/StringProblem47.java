package String;

import java.util.Scanner;

public class StringProblem47{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll("\\s+", ".");
        System.out.println(str);
    }
}