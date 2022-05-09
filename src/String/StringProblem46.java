package String;

import java.util.Scanner;

public class StringProblem46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");

        int max = Integer.MIN_VALUE;
        for (String word : words) {
            if (word.length() > max) {
                max = word.length();
            }
        }
        System.out.println(max);
    }
}