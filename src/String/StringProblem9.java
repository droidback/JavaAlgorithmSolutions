package String;

import java.util.Scanner;

public class StringProblem9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String sign1 = scan.next();
        String sign2 = scan.next();
        for (int i = 0; i < n; i++) {
            if (i%2==0) System.out.println(sign1);
            else System.out.println(sign2);
        }
    }
}