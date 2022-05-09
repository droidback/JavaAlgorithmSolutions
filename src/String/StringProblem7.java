package String;

import java.util.Scanner;

public class StringProblem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println((int) str.charAt(0) + " " + (int) str.charAt(str.length() - 1));
    }
}