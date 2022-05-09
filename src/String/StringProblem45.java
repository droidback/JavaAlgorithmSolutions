package String;

import java.util.Scanner;

public class StringProblem45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");

        int min = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < min) {
                min = word.length();
            }
        }
        System.out.println(min);
    }
}