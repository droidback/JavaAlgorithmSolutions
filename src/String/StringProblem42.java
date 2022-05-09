package String;

import java.util.Scanner;

public class StringProblem42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                count++;
            }
        }
        System.out.println(count);

    }
}