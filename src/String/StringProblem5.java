package String;

import java.util.Scanner;

public class StringProblem5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        char sign;
        for (int i = 0; i < n && n < 27; i++) {
            sign = (char) (122 - i);
            System.out.println(sign);
        }
    }
}