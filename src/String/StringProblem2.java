package String;

import java.util.Scanner;

public class StringProblem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char sign = (char) scan.nextInt();
        if (32 < sign && sign < 127) System.out.println(sign);
        else System.out.println("invalid input!");
    }
}