package String;

import java.util.Scanner;

public class StringProblem24{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum <<= 1;
            if (str.charAt(i) == '1') sum++;
        }
        System.out.println("\"" + str + "\" -> " + sum);
    }
}