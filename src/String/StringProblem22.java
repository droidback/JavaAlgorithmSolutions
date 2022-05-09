package String;

import java.util.Scanner;

public class StringProblem22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] a = str.toCharArray();
        int sum = 0;
        for (char c : a) {
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}