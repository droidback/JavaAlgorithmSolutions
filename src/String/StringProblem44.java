package String;

import java.util.Scanner;

public class StringProblem44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        int count = 0, count2 = 0;
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == 'A') {
                    count++;
                }
                if (j == word.length() - 1) {
                    if (count == 3) count2++;
                    count = 0;

                }
            }
        }
        System.out.println(count2);
    }
}