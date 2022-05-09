package String;

import java.util.Scanner;

public class StringProblem43{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        int count = 0;
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == 'A') {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}