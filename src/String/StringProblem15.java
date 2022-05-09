package String;

import java.util.Scanner;

public class StringProblem15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (97 <= str.charAt(i) && str.charAt(i) <= 122 || 1072 <= str.charAt(i) && str.charAt(i) <= 1103) count++;
        }

        System.out.println(count);
    }
}