package String;

import java.util.Scanner;

public class StringProblem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char sign = scan.next().charAt(0);
        System.out.println((char) (sign - 1) + " " + (char) (sign + 1));
    }
}